package com.example.Ohjelmistoprojekti.demo.domain;

public class Answer {
	private Long id;
	private String option;

	public Answer(Long id, String option) {
		super();
		this.id = id;
		this.option = option;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", option=" + option + "]";
	}

}
