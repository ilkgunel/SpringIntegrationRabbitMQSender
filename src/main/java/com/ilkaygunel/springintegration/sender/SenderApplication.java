package com.ilkaygunel.springintegration.sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenderApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SenderApplication.class, args).close();
	}
}