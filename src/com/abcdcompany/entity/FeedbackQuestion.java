package com.abcdcompany.entity;

import java.time.LocalDateTime;

public class FeedbackQuestion {
	public FeedbackQuestion() {
		super();
	}
	private int id;
    private String questionText;
    private String answerType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private SessionInfo session;
    private Employee createdBy;
	
    public FeedbackQuestion(int id, String questionText, String answerType, LocalDateTime createdAt,
			LocalDateTime updatedAt, SessionInfo session, Employee createdBy) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.answerType = answerType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.session = session;
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getAnswerType() {
		return answerType;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
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

	public SessionInfo getSession() {
		return session;
	}

	public void setSession(SessionInfo session) {
		this.session = session;
	}

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
}
