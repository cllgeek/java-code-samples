package org.geekjc.shirostarter;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.security.auth.login.AccountNotFoundException;

/**
 * @author ll
 * @date 2019年09月28日 1:30 PM
 */
public class MyRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        if (!"geekjc".equals(username)) {
            throw new UnknownAccountException("账户不存在!");
        }
        return new SimpleAuthenticationInfo(username, "123", getName());
    }
}
