package com.hibernate.HCQLExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Emp {
	@Column
	@Id
	public int empno;
	@Column
	public String ename;
	@Column
	public String job;
	@Column
	public double sal;
	@Column
	public int deptno;
	
	public int getEmpno() { return empno;}
	public String getEname() { return ename; }
	public String getJob() { return job; }
	public double getSal() { return sal; }
	public int getDeptno() { return deptno; }
}
