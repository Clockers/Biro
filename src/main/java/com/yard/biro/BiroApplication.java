package com.yard.biro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiroApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoData(UserRepository repo) {
		return args -> {
			repo.save(new User(null,"username","$2a$12$mT1FXVKWodQBn8RHMpYrOOilaW8NiodDd8k1anfX7WQGSqGMgOj8C"));
		};
	}

}
