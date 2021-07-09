package com.veterinary_clinic_adm.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.veterinary_clinic_adm.register")
@EntityScan(scanBasePackages = "com.veterinary_clinic_adm.register.model")
public class RegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

}
