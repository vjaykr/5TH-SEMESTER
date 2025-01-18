package com.hibernate.HCQLExample;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

import java.util.*;

public class pagination {

	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			List<Emp> empList = new ArrayList<Emp>();
			
			empList = session.createCriteria(Emp.class)
					.addOrder(Order.desc("id"))
					.setFirstResult(0)
					.setMaxResults(2)
					.list();
			
			System.out.println("-------------------------");
			System.out.println("Empno\tEname\tSalary");
			System.out.println("-------------------------");

			for(Emp e : empList){
				System.out.println(e.empno + "\t" + e.getEname() + "\t" + e.getSal());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
