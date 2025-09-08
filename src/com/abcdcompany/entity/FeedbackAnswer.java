package com.abcdcompany.entity;

import java.time.LocalDateTime;

public class FeedbackAnswer {
	public FeedbackAnswer() {
		super();
	}

	private int id;
    private Integer numericScore; 
    private String answerText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Trainer trainer;
    private FeedbackQuestion question;
    private Enrollment enrollment;
    
    public FeedbackAnswer(int id, Integer numericScore, String answerText, LocalDateTime createdAt,
			LocalDateTime updatedAt, Trainer trainer, FeedbackQuestion question, Enrollment enrollment) {
		super();
		this.id = id;
		this.numericScore = numericScore;
		this.answerText = answerText;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.trainer = trainer;
		this.question = question;
		this.enrollment = enrollment;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getNumericScore() {
		return numericScore;
	}

	public void setNumericScore(Integer numericScore) {
		this.numericScore = numericScore;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public FeedbackQuestion getQuestion() {
		return question;
	}

	public void setQuestion(FeedbackQuestion question) {
		this.question = question;
	}

	public Enrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}
}
