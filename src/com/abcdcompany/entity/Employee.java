package com.abcdcompany.entity;

import java.time.LocalDateTime;

public class Employee {
	private int id;
    private String employeeCode;
    private String firstName;
    private String lastName;
    private String workEmail;
    private long employeePhNo;
    private String departmentName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

	public Employee(int id, String employeeCode, String firstName, String lastName, String workEmail, long employeePhNo,
			String departmentName, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workEmail = workEmail;
		this.employeePhNo = employeePhNo;
		this.departmentName = departmentName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
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
	public String getWorkEmail() {
		return workEmail;
	}
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	public long getEmployeePhNo() {
		return employeePhNo;
	}
	public void setEmployeePhNo(long employeePhNo) {
		this.employeePhNo = employeePhNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	public Employee() {
		super();
	}

}
