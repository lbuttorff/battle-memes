package com.ist411.memes.controllers;

import com.ist411.memes.repos.PostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BattleMemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BattleMemesApplication.class, args);
	}
}
