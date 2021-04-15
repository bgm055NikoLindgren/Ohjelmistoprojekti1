package com.example.Ohjelmistoprojekti.demo.domain;

import java.util.List;

public class Query {
private Long id;
private String question;
private List<Answer> answers;

public Query(long id, String question) {
   this.id = id;
   this.question = question;
    
}


public List<Answer> getAnswers() { return answers; }
public void setAnswers(List<Answer> answers) { this.answers = answers;}


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}

@Override
public String toString() {
	return "Query [id=" + id + ", question=" + question + "]";
}




}
