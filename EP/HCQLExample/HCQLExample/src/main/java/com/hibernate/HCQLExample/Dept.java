package com.hibernate.HCQLExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dept")
public class Dept {
	@Column
	@Id
	public int deptno;
	@Column
	public String dname;
	@Column
	public String loc;
	
	public int getDeptno() { return deptno; }
	public String getDname() { return dname; }
	public String getLoc() { return loc;}
}
