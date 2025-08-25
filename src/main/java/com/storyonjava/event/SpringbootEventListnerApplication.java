package com.storyonjava.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootEventListnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEventListnerApplication.class, args);
	}

}
