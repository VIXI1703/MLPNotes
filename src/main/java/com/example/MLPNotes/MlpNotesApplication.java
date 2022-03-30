package com.example.MLPNotes;


import com.example.MLPNotes.Domain.Case;
import com.example.MLPNotes.Repository.CaseRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MlpNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MlpNotesApplication.class, args);

	}
}


