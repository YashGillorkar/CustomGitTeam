package com.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Employee;
import com.application.repostiory.EmployeeRepo;
import com.application.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired EmployeeRepo er;

	@Override
	public void saveListData(List<Employee> listEmp) {
		er.saveAll(listEmp);
		
	}

}
