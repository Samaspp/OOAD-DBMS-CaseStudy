package com.abcdcompany.entity;

import java.time.LocalDateTime;

public class SessionInfo {
	private int id;
    private String sessionTitle;
    private LocalDateTime scheduledStart;
    private LocalDateTime scheduledEnd;
    private String location;
    private String deliveryMode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Phase phase;
    private Employee createdBy;
    
    public SessionInfo() {
		super();
	}
    
    public SessionInfo(int id, String sessionTitle) {
		super();
		this.id = id;
		this.sessionTitle = sessionTitle;
	}
    
    public SessionInfo(int id, String sessionTitle, LocalDateTime scheduledStart, LocalDateTime scheduledEnd,
			String location, String deliveryMode, LocalDateTime createdAt, LocalDateTime updatedAt, Phase phase,
			Employee createdBy) {
		super();
		this.id = id;
		this.sessionTitle = sessionTitle;
		this.scheduledStart = scheduledStart;
		this.scheduledEnd = scheduledEnd;
		this.location = location;
		this.deliveryMode = deliveryMode;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.phase = phase;
		this.createdBy = createdBy;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSessionTitle() {
		return sessionTitle;
	}
	public void setSessionTitle(String sessionTitle) {
		this.sessionTitle = sessionTitle;
	}
	public LocalDateTime getScheduledStart() {
		return scheduledStart;
	}
	public void setScheduledStart(LocalDateTime scheduledStart) {
		this.scheduledStart = scheduledStart;
	}
	public LocalDateTime getScheduledEnd() {
		return scheduledEnd;
	}
	public void setScheduledEnd(LocalDateTime scheduledEnd) {
		this.scheduledEnd = scheduledEnd;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
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
	public Phase getPhase() {
		return phase;
	}
	public void setPhase(Phase phase) {
		this.phase = phase;
	}
	public Employee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
}
