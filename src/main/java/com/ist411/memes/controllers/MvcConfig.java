package com.ist411.memes.controllers;

import com.ist411.memes.daos.UserRepository;
import com.ist411.memes.services.MyUserDetailsService;
import com.ist411.memes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public UserService UserService(){
        return new UserService();
    }

    /*public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("main");
        //registry.addViewController("/global").setViewName("global-feed");
        //registry.addViewController("/login").setViewName("login");
        //registry.addViewController("/signup").setViewName("registration");
    }*/

}