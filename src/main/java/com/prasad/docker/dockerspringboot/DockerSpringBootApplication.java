package com.prasad.docker.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DockerSpringBootApplication {
	
	@GetMapping("/message")
	public String getMessage(){
		return "Welcome to java techie"
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}
