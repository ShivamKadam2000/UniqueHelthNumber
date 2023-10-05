package com.UHN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.UHN.Controller","com.UHN.Service"})
@ComponentScan("com.UHN")
public class UhnProjectnewApplication {

	public static void main(String[] args) {
		SpringApplication.run(UhnProjectnewApplication.class, args);
	}

}
