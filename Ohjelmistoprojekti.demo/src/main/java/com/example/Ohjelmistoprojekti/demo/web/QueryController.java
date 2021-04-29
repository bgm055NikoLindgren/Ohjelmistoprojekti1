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

@RestController
@RequestMapping(path="api/questions")
public class QueryController {

	@GetMapping
	public List<Query> kysymys(){
		return List.of(
				new Query (
						1L,"Oletko kisacxaza"),
				new Query(
						2L,"Oletko Toivanen"),
				new Query (
						3L,"Kerro itsestäsi jotain"),
				new Query(
						4L,"Kuinka kissa olet 1-5"),
				new Query(
						5L,"Valitse kaikki mihin olet tyytyväinen"));
		
				
				
		
	}
	
}


