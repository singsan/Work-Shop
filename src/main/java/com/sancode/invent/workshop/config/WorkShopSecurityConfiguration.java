package com.sancode.invent.workshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WorkShopSecurityConfiguration extends WebSecurityConfigurerAdapter {

  /*  @Autowired
    WorkshopAuthenticationProvider workshopAuthenticationProvider;

    *//**
     * @param auth
     * @throws Exception
     *//*
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(workshopAuthenticationProvider);
    }*/

    /**
     * @param httpSecurity
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic();
                httpSecurity.authorizeRequests().anyRequest().authenticated();
    }


}
