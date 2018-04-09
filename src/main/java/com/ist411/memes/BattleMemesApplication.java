package com.ist411.memes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.ist411.memes.services"})
public class BattleMemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BattleMemesApplication.class, args);
	}
}
