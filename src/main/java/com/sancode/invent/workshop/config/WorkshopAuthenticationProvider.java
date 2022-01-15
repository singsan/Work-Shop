/*
package com.sancode.invent.workshop.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.function.BiFunction;

*/
/**
 * @Author Sanjay
 * @version version1
 *//*

@Component
@Slf4j
public class WorkshopAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        var userName = authentication.getName();
        var password = String.valueOf(authentication.getCredentials());

        if (isCredentialsAreValid((u, p) -> u.equals("sanjay") & p.equals("12345"), userName, password)) {
            return new UsernamePasswordAuthenticationToken(userName, password, new ArrayList<>());
        } else {
            log.error("user or password is not correct");
            throw new AuthenticationCredentialsNotFoundException("user or password is not correct");
        }
    }

    @Override
    public boolean supports(Class<?> authenticationType) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authenticationType);
    }

    */
/**
     * @param credentials
     * @param userName
     * @param password
     * @return
     *//*

    private Boolean isCredentialsAreValid(BiFunction<String, String, Boolean> credentials, String userName, String password) {
        return credentials.apply(userName, password);
    }
}
*/
