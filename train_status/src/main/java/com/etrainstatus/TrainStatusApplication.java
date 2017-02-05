package com.etrainstatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableWebMvc
@ImportResource("classpath:ApplicationContext.xml")
public class TrainStatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainStatusApplication.class, args);
	}
}
