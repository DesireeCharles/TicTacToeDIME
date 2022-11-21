package info.scce.dime.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import org.apache.commons.lang3.StringUtils;


public class CommonNativeUtilsServiceLibrary {

    public static String randomUUID() {
        return java.util.UUID.randomUUID().toString();
    }

    public static void sleepForSomeTime(Long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean sendMail(String senderName, String senderEmail, String recipientName, String recipientEmail, String subject, String body) {
        try {
            final InternetAddress addressFrom;
            try {
                addressFrom = createInternetAddress(senderEmail, senderName);
            }
            catch (UnsupportedEncodingException e) {
                // TODO logging/error handling.
                System.err.println("Unsupported encoding: " + e.getMessage());
                return false;
            }

            final InternetAddress addressTo;
            try {
                addressTo = createInternetAddress(recipientEmail, recipientName);
            }
            catch (UnsupportedEncodingException e) {
                // TODO logging/error handling.
                System.err.println("Unsupported encoding: " + e.getMessage());
                return false;
            }

            final InternetAddress addressSender = InternetAddress.getLocalAddress(SESSION);

            final MimeMessage msg;
            try {
                msg = createMessage(addressTo, subject, body, addressSender, addressFrom);
            }
            catch (UnsupportedEncodingException e) {
                // TODO logging/error handling.
                System.err.println("Unsupported encoding: " + e.getMessage());
                return false;
            }

            Transport.send(msg);
            return true;
        }
        catch (MessagingException e) {
            // TODO logging/error handling.
            System.err.println("Messaging exception: " + e.getMessage());
            return false;
        }
    }

    private static MimeMessage createMessage(InternetAddress addressTo,
            String subject,
            String body,
            InternetAddress addressSender,
            InternetAddress addressFrom)
            throws UnsupportedEncodingException, MessagingException {
            MimeMessage msg = new MimeMessage(SESSION);

            subject = MimeUtility.encodeText(subject, "utf-8", "Q");

            msg.setFrom(addressFrom);
            msg.addHeader("Sender", addressSender.getAddress());

            msg.setRecipient(Message.RecipientType.TO, addressTo);
            msg.setSubject(subject);

            msg.setContent(body, "text/plain; charset=\"UTF-8\"");

            return msg;
    }

    private static InternetAddress createInternetAddress(String mailAddress, String fullName)
            throws UnsupportedEncodingException, AddressException {
            String encodedAddress = MailAddressUtil.convertMailAddressToIDN((mailAddress));
            String encodedName = MimeUtility.encodeText(fullName, "utf-8", "Q");

            // unregistered users have no name yet and we don't want so send an e-mail to " <address>" but "address"
            if (encodedName.trim().isEmpty()) {
                return new InternetAddress(encodedAddress);
            }

            return new InternetAddress(encodedAddress, encodedName);
    }

    /**
     * The mail session.
     */
    private static final Session SESSION;

    static {
        final Properties props = new Properties();

        /*
         * TODO: Fix defaults The defaults are overwritten by installation details. On freshly built ocs-testinstances
         * this is not the case and the defaults are used
         */
        props.setProperty("mail.smtp.port", "25");
        props.setProperty("mail.smtp.auth", "false");
        props.setProperty("mail.smtp.starttls.enable", "false");

        InputStream is = CommonNativeUserServiceLibrary.class.getClassLoader().getResourceAsStream("mail.properties");
        if (is != null) {
            try {
                props.load(is);
            }
            catch (IOException e) {
                // TODO use a logger!
                System.err.println("Failed to load mail properties, using defaults: " + e.getMessage());
            }
        }

        // noinspection UseOfPropertiesAsHashtable
        //		props.put("mail.smtp.socketFactory", new SimpleSSLSocketFactory());
        //		props.setProperty("mail.smtp.socketFactory.fallback", "true");

        SESSION = Session.getInstance(props, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                String user = props.getProperty("mail.user");
                String password = props.getProperty("mail.passwd");
                return new PasswordAuthentication(user, password);
            }

        });
    }

    /**
     * Util class for converting/validating mail addresses especially for IDNs (like domain names containing one or more
     * german umlauts).
     *
     * @author Johannes Neubauer
     * @author Stephan Windmüller
     */
    private static class MailAddressUtil {

        static final Pattern DOMAIN_SEPARATOR = Pattern.compile("\\.");

        static final Pattern MAIL_SEPARATOR = Pattern.compile("@");

        static String convertMailAddressToIDN(String address) throws IllegalArgumentException {
            String[] adressParts = MAIL_SEPARATOR.split(address);
            if (adressParts.length != 2) {
                throw new IllegalArgumentException("given address" + address + "is not a valid mailadress!");
            }
            String localPart = adressParts[0];
            String domainPart = adressParts[1];

            String[] domains = DOMAIN_SEPARATOR.split(domainPart);
            for (int i = 0; i < domains.length; i++) {
                domains[i] = IDN.toASCII(domains[i]);
            }

            domainPart = StringUtils.join(domains, ".");
            return localPart + '@' + domainPart;
        }

        public static boolean isMailAddressValid(String address) {
            address = address.trim();

            if (!address.isEmpty()) {

                // Filter local addresses
                if (StringUtils.countMatches(address, "@") != 1) {
                    return false;
                }

                // Addresses must not contain spaces or brackets
                if (address.contains(" ") || address.contains("<") || address.contains(">") || address.contains("(")
                        || address.contains(")")) {
                    return false;
                        }

                // Check for invalid characters
                if (address.contains("\u200b")) {
                    return false;
                }

                // Addresses must not contains commas
                if (address.contains(",")) {
                    return false;
                }
                try {
                    address = convertMailAddressToIDN(address);
                }
                catch (IllegalArgumentException iae) {
                    return false;
                }
                // Check compliance to RFC822
                try {
                    new InternetAddress(address);
                }
                catch (AddressException ae) {
                    return false;
                }

                // Check if hostname is an FQDN
                String[] addressParts = MAIL_SEPARATOR.split(address);
                String hostName = addressParts[1];
                if (!hostName.contains(".")) {
                    return false;
                }
            }

            return true;
        }

    }
}

