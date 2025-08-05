package br.com.etechas.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Pw3TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pw3TasksApplication.class, args);
	}

}
