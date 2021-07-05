package com.veterinary_clinic_adm.schedulingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SchedulingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingserviceApplication.class, args);
	}

}
