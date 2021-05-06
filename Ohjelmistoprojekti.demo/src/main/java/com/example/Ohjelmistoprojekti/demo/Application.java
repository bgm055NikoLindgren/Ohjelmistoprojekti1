package com.example.Ohjelmistoprojekti.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Ohjelmistoprojekti.demo.domain.Answer;
import com.example.Ohjelmistoprojekti.demo.domain.Query;
import com.example.Ohjelmistoprojekti.demo.repository.AnswerRepository;
import com.example.Ohjelmistoprojekti.demo.repository.QueryRepository;


@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private AnswerRepository aRepository;
	@Autowired
	private QueryRepository qRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.aRepository.save(new Answer("Kyllä"));
		this.aRepository.save(new Answer("Ei"));
		
		
		this.qRepository.save(new Query("Oletko kisza"));
		this.qRepository.save(new Query("Mikä fiilis"));

		
	}

}
