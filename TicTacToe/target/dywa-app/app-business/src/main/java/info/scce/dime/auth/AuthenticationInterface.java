package info.scce.dime.auth;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by frohme on 25.11.15.
 */
public interface AuthenticationInterface {

	String REALM = "DyWARealm";

	AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException;

}
