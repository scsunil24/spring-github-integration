package io.sunilbranch.springgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringGitHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGitHubApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Building the initial commit");
	}
}
