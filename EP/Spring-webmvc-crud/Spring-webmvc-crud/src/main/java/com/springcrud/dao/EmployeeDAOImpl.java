package com.springcrud.dao;

import java.util.List;

import jakarta.transaction.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcrud.models.*;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Employee> findAll() {
		return sessionFactory
				.getCurrentSession()
				.createQuery("from Employee")
				.list();
	}

	public Employee findById(int empId) {
		
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where empId="+empId)
				.uniqueResult();
		
		//return sessionFactory.getCurrentSession().get(Employee.class, empId);
		
	}

	public boolean addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	public boolean deleteEmployee(int empId) {
		sessionFactory.getCurrentSession().delete(findById(empId));	
		return true;
	}

	public Employee findByName(String name) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where name='"+ name + "'")
				.uniqueResult();
	}
}