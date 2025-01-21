package com.example.alura.Challenge_foro_hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {
		"com.alura.foro.hub.dominio.topico",
		"com.alura.foro.hub.dominio.usuario"})
public class ChallengeForoHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeForoHubApplication.class, args);
	}

}
