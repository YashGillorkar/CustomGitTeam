package com.application.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.ResponseDto;
import com.application.model.Employee;
import com.application.service.EmployeeService;

@RestController
public class HomeController {
	
	@Autowired EmployeeService esi;
	
	@PostMapping("/postData")
	public ResponseEntity<ResponseDto> postListOfData(@RequestBody List<Employee> listEmp){
		esi.saveListData(listEmp);
		 ResponseDto response = new ResponseDto("Data Added Successfully", new Date());
		 return new ResponseEntity<ResponseDto>(response,HttpStatus.CREATED);
	}

}
