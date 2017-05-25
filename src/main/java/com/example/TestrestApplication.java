package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestrestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestrestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TestrestApplication.class, args);
	}

	@RestController
	public class TestController {

		@RequestMapping("/test")
		public String test() {
			System.out.println("*!@!@msg recd!!");
			return "received";
		}

		@RequestMapping("/")
		public Person root() {
			System.out.println(" message received from outbound channel gateway!!");
			return new Person("STGIT", 21);
		}

		@RequestMapping("/get")
		public Person getPerson(int id) {
			return new Person("jio", 1);
		}

	}
}
