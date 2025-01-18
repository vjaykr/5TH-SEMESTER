package com.hibernate.HCQLExample;

import org.hibernate.Session;
import org.hibernate.criterion.Projections;

public class groupbytables {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			double sumSalary = (Double) session.createCriteria(Emp.class)
	    			.setProjection(Projections.sum("sal"))
	    			.uniqueResult();
	    		System.out.println("Sum of Salaries="+sumSalary);
		} catch(Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}
	}
}
