package com.hibernate.HCQLExample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Criterion;

public class search {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			Criteria criteria = session.createCriteria(Emp.class);
			Criterion searchempno = Restrictions.eq("id", 7654);
			criteria.add(searchempno);

			Emp emp = (Emp) criteria.uniqueResult();

			/*Emp emp = (Emp) session
						.createCriteria(Emp.class)
						.add(Restrictions.eq("id", 7654))
						.uniqueResult();
			*/
			System.out.println("Empno :" + emp.getEmpno() + 
				" and Name = " + emp.getEname()); 
			
			
			List<Emp> empList = (List<Emp>) session
			.createCriteria(Emp.class)
			.add(Restrictions.gt("sal", 2000.00))
			.list();

			System.out.println("-------------------------");
			System.out.println("Empno\tEname\tSalary");
			System.out.println("-------------------------");

			for(Emp e : empList){
				System.out.println(e.empno + "\t" + e.getEname() + "\t" + e.getSal());
			}
		}
		catch(Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}
	}
}
