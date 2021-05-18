package com.example.Ohjelmistoprojekti.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ohjelmistoprojekti.demo.domain.Answer;
import com.example.Ohjelmistoprojekti.demo.domain.Query;
import com.example.Ohjelmistoprojekti.demo.repository.AnswerRepository;
import com.example.Ohjelmistoprojekti.demo.repository.QueryRepository;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class AnswerController {
	
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@PostMapping("api/answers")
	public ResponseEntity<String> submitAnswers(@RequestBody List<Answer> answers) {
		
		answerRepository.saveAll(answers);
		
		return new ResponseEntity<>("answers submitted", HttpStatus.OK);	
	}
	
	@GetMapping("api/answers")
	public List <Answer> getAnswers(){
		return this.answerRepository.findAll();
		
	}
		
	}
	
	
	

