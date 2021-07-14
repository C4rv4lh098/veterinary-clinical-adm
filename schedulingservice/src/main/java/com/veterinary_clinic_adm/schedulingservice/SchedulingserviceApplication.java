package com.veterinary_clinic_adm.schedulingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
// @RestController
@EntityScan
public class SchedulingserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SchedulingserviceApplication.class, args);
	}

}
