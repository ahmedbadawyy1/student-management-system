package com.aaa.sys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SysApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SysApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
