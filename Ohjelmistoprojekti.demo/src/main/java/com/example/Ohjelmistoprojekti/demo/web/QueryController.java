package com.example.Ohjelmistoprojekti.demo.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Ohjelmistoprojekti.demo.domain.Query;
import com.example.Ohjelmistoprojekti.demo.repository.QueryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(path="api/questions")
public class QueryController {

		
	@Autowired
	private QueryRepository queryRepository;
	
	@GetMapping
	public List<Query> getQueries(){
		return this.queryRepository.findAll();
		
				
				
		
	}
	
}


