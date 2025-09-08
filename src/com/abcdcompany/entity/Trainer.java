package com.abcdcompany.entity;

import java.time.LocalDateTime;

public class Trainer {
	private int id;
    private String firstName;
    private String lastName;
    private String contactEmail;
    private long contactPhNo;
    private String organization;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Trainer() {
		super();
	}
	public Trainer(int id, String firstName, String lastName, String contactEmail, long contactPhNo,
			String organization, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactEmail = contactEmail;
		this.contactPhNo = contactPhNo;
		this.organization = organization;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public long getContactPhNo() {
		return contactPhNo;
	}
	public void setContactPhNo(long contactPhNo) {
		this.contactPhNo = contactPhNo;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
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

}

