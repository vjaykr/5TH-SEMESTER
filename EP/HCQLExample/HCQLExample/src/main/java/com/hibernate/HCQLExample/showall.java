package com.hibernate.HCQLExample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class showall {
	
	public void main(String [] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
	
		try {
			//Get All Employees
			Criteria criteria = session.createCriteria(Emp.class);
	
			//List<Employee> emplist1 = session.createCriteria(Employee.class).list();
			List<Emp> empList = criteria.list();
			
			for(Emp emp : empList){
				System.out.println("Empno =" + emp.empno + 
						", Ename =" + emp.getEname());
			}
		}
		catch(Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}
	}
}
