package com.ist411.memes;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@EnableTransactionManagement - I don't know where this comes from...
@ImportResource({"classpath:hibernate5Configuration.xml"})
public class HibernateXMLConf {
}
