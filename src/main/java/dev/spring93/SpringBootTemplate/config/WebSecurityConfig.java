package dev.spring93.SpringBootTemplate.config;

import dev.spring93.SpringBootTemplate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
// @EnableWebSecurity
public class WebSecurityConfig {

    public UserService userService;

    @Autowired
    public WebSecurityConfig(UserService userService){
        this.userService = userService;
    }


}
