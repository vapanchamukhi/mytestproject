package com.practice;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
 * @EnableJpaAuditing should be here added to capture Created Date and 
 * Last Modified Date automatically in UserEntity.java
 */

@SpringBootApplication
@EntityScan(basePackageClasses = {
		Application.class,
		Jsr310JpaConverters.class
})
@EnableJpaAuditing
public class Application {
	
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
