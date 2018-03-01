package com.testlab.langfeaturetryout;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LangFeatureTryoutApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LangFeatureTryoutApplication.class, args);
	}

	public void run(String... args){
		int i1 = 3;
		Integer i2 = 3;
		if(i1 == i2)
			System.out.println("Equals!!");
		else
			System.out.println("Not Equal!");
	}
}
