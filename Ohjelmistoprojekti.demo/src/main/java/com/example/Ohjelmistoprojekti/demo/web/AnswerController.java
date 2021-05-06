package com.example.Ohjelmistoprojekti.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ohjelmistoprojekti.demo.domain.Answer;
import com.example.Ohjelmistoprojekti.demo.repository.AnswerRepository;

@RestController
@RequestMapping("api/answers")
public class AnswerController {
	
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@GetMapping
	public List<Answer> getAnswers(){
			return this.answerRepository.findAll();
	
		
	}

}
