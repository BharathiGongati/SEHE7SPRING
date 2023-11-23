package org.jsp.springhibernatedemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.jsp.springhibernatedemo.dto.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@Transactional
	public Employee saveEmployee(Employee e) {
		template.save(e);
		return e;
		
	}
	@Transactional
	public Employee updateEmployee(Employee e) {
		template.update(e);
		return e;
		
	}
	public Employee findEmployeeById(int id) {
		
		return template.get(Employee.class, id);
		
	}
	@Transactional
	public boolean deleteEmployee(int id) {
		Employee e=findEmployeeById(id);
		if(e!=null) {
			template.delete(e);
			return true;
		}
		return false;
		
	}
	public List<Employee> findAll(){
		return template.loadAll(Employee.class);
		
	}
}
	


