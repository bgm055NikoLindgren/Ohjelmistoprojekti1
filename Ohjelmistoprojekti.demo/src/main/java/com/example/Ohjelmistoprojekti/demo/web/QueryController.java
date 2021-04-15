package com.example.Ohjelmistoprojekti.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ohjelmistoprojekti.demo.domain.Answer;
import com.example.Ohjelmistoprojekti.demo.domain.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class QueryController {
	private static final String template = "Oletko kissa?";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/query")
	public Query getAnswers(@RequestParam(value = "name", defaultValue = "Olen") String name) {
		return new Query(counter.incrementAndGet(), String.format(template, name));
	}

	 @RequestMapping("/scoreboard")
	    public String scoreboard(){
	        return "scoreboard";
	    }

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getMyFriends(Model model) {
		List<Query> queries = new ArrayList<Query>();
		queries.add(new Query(1, "Oletko Kisza?"));
	
		model.addAttribute("queries", queries);
		return "query";
	}
	
	
}


