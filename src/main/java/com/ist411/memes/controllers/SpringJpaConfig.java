package com.ist411.memes.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ImportResource( "classpath*:SpringDataConfig.xml" )
public class SpringJpaConfig {
}
