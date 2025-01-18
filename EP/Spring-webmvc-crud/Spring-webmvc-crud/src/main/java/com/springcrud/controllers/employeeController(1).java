package com.springcrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springcrud.models.Employee;
import com.springcrud.services.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class employeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView landing(ModelAndView model) {
		model.addObject("employee", new Employee());
		model.addObject("listemployees", employeeService.findAllEmployees());
		model.setViewName("index");
		return model;
	}
	
	//Create a form for new employee
    @RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
    public ModelAndView newEmployee(ModelAndView model) {
        Employee employee = new Employee();
        model.addObject("employee", employee);
        model.setViewName("register");
        return model;
    }
    
    //Save new / edit employee
    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
        if (employee.getEmpId() == 0) { 
            employeeService.addEmployee(employee);
        } else {
            employeeService.updateEmployee(employee);
        }
        return new ModelAndView("redirect:/");
    }
    
    //Delete employee
    @RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(HttpServletRequest request) {
        int employeeId = Integer.parseInt(request.getParameter("id"));
        employeeService.deleteEmployee(employeeId);
        return new ModelAndView("redirect:/");
    }
 
    //Edit employee form
    @RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request, ModelAndView model) {
        //Find the employee details / id
    	int employeeId = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findEmployeesById(employeeId);
        
        model.setViewName("register");
        
        model.addObject("employee", employee);
 
        return model;
    }	
}