package com.springcrud.models;

import jakarta.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name="empmaster")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	@NonNull
	@Column(name="fullname")
	private String name;
	
	@NonNull
	@Column(name="email",unique=true)
	private String email;
	
	@NonNull
	@Column(name="mobile",unique=true)
	private String mobile;
	
	@NonNull
	@Column(name="deptno")
	private int deptno;

	public Employee() {}
	public Employee(int empId, String name, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
	}
	
	public int getEmpId() { return empId;}
	public void setEmpId(int empId) { this.empId = empId; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email;}
	
	public String getMobile() { return mobile; }
	public void setMobile(String mobile) { this.mobile = mobile; }
	
	public int getDeptno() { return deptno; }
	public void setDeptno(int deptno) { this.deptno = deptno; }
}
