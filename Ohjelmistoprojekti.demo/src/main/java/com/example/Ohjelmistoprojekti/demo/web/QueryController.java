package com.example.Ohjelmistoprojekti.demo.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.Ohjelmistoprojekti.demo.domain.Query;
import com.example.Ohjelmistoprojekti.demo.repository.QueryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@CrossOrigin(origins="http://localhost:3000")
@RestController

public class QueryController {

		
	@Autowired
	private QueryRepository queryRepository;
	
	@GetMapping("api/questions")
	public List<Query> getQueries(){
		return this.queryRepository.findAll();
				
		
	}
	
	@DeleteMapping("api/questions/{id}")
	public @ResponseBody void deleteQuestion(@PathVariable Long id) {
		queryRepository.deleteById(id);
		
	}
	@PostMapping("api/questions")
	  Query newQuery(@RequestBody Query newQuery) {
	    return queryRepository.save(newQuery);
	  }
	 @PutMapping("api/questions/{id}")
	 Query replaceQuery(@RequestBody Query newQuery, @PathVariable Long id) {
		return queryRepository.findById(id)
			.map(query -> {
				query.setQuestion(newQuery.getQuestion());
				return queryRepository.save(query);
			})
			 .orElseGet(() -> {
			        newQuery.setId(id);
			        return queryRepository.save(newQuery);
			      });
	 }
	}



