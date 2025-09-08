package com.abcdcompany.entity;

import java.time.LocalDateTime;

public class Enrollment {
	private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Employee employee;
    private SessionInfo session;
    
	public Enrollment(int id, LocalDateTime createdAt, LocalDateTime updatedAt, Employee employee,
			SessionInfo session) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.employee = employee;
		this.session = session;
	}
	
	public Enrollment() {
		super();
	}
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public SessionInfo getSession() {
		return session;
	}
	public void setSession(SessionInfo session) {
		this.session = session;
	}
}
