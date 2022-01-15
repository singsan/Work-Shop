package com.sancode.invent.workshop.config;

import com.sancode.invent.workshop.annotations.SecurityInfo;
import com.sancode.invent.workshop.users.InMemoryUserDetailsService;
import com.sancode.invent.workshop.users.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @SecurityInfo
 * @author sajay
 * @apiNote Testing
 */
@Configuration
@SecurityInfo(author = "Sanjay", status = SecurityInfo.Status.OK)
public class UserManagementConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = new User("vijay","vijay","READ");
        /*var userDetailsService = new InMemoryUserDetailsManager();
        var user = User.withUsername("sanjay123").password("12345").authorities("read").build();
        userDetailsService.createUser(user);*/
        List<UserDetails> users = List.of(user);
        return new InMemoryUserDetailsService(users);

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
