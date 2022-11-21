package info.scce.dime.auth;

import info.scce.dime.util.CDIUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.Realm;

/**
 * Created by frohme on 25.11.15.
 */
public class Authenticator extends AuthenticatingRealm implements Realm {

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		return CDIUtil.getManagedInstance(AuthenticationInterface.class).doGetAuthenticationInfo(token);
	}
}
