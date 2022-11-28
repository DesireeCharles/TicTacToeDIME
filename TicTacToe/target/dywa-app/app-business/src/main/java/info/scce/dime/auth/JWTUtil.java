package info.scce.dime.auth;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jwt.JWTClaimsSet;
import info.scce.dime.util.Constants;

public class JWTUtil {

    private static final String KEY_ID = "dime";
    private static final int TIMEOUT_IN_MS = 1000 * 60 * 60 * 24; // one day

    public static final String FIRST_NAME_CLAIM = "firstName";
    public static final String LAST_NAME_CLAIM = "lastName";

    private final static RSAKey KEY_PAIR;

    static {
        String privateKey = System.getProperty(Constants.PRIVATE_KEY_PROPERTY);
        String publicKey = System.getProperty(Constants.PUBLIC_KEY_PROPERTY);

        if (privateKey == null) {
            throw new IllegalStateException("PrivateKey '" + Constants.PRIVATE_KEY_PROPERTY +
                                            "' has not been specified");
        }
        if (publicKey == null) {
            throw new IllegalStateException("PublicKey '" + Constants.PUBLIC_KEY_PROPERTY +
                                            "' has not been specified");
        }

        try {
            final KeyFactory kf = KeyFactory.getInstance("RSA");
            final PKCS8EncodedKeySpec privateKeySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey));
            final X509EncodedKeySpec publicKeySpecX509 = new X509EncodedKeySpec(Base64.getDecoder().decode(publicKey));

            final RSAKey jwk = new RSAKey.Builder((RSAPublicKey) kf.generatePublic(publicKeySpecX509))
            		.privateKey((RSAPrivateKey) kf.generatePrivate(privateKeySpecPKCS8))
            		.keyID(KEY_ID)
            		.build();

            KEY_PAIR = jwk.toRSAKey();

        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new IllegalStateException(e);
        }
    }

    public static JWSObject createToken(long authId, String firstNameClaim, String lastNameClaim) {

        final Date now = new Date();
        final JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
        		.subject(Long.toString(authId))
                 .issueTime(now)
                 .jwtID(UUID.randomUUID().toString())
                 .expirationTime(new Date(now.getTime() + TIMEOUT_IN_MS))
                 .notBeforeTime(now)
                 .claim(FIRST_NAME_CLAIM, firstNameClaim)
                 .claim(LAST_NAME_CLAIM, lastNameClaim)
                 .build();

        final JWSHeader header = new JWSHeader.Builder(JWSAlgorithm.RS256).keyID(KEY_PAIR.getKeyID()).build();
        final Payload payload = new Payload(claimsSet.toJSONObject());
        return new JWSObject(header, payload);
    }

    public static String signToken(JWSObject object) throws JOSEException {
        final JWSSigner signer = new RSASSASigner(KEY_PAIR);
        object.sign(signer);
        return object.serialize();
    }

    public static JWSObject parseToken(String token) throws ParseException {
        return JWSObject.parse(token);
    }

    public static boolean validateToken(JWSObject token) {
        try {
            final JWSVerifier verifier = new RSASSAVerifier(KEY_PAIR);
            return token.verify(verifier);
        } catch (JOSEException ex) {
            return false;
        }
    }

    public static JWTClaimsSet parseClaims(JWSObject object) throws ParseException {
        return JWTClaimsSet.parse(object.getPayload().toJSONObject());
    }

}
