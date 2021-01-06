package com.demo.springdatajpabatchinsertion.controller;

import com.demo.springdatajpabatchinsertion.entity.Company;
import com.demo.springdatajpabatchinsertion.entity.Employee;
import com.demo.springdatajpabatchinsertion.service.CompanyService;
import com.demo.springdatajpabatchinsertion.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RstController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CompanyService companyService;

    @PostMapping("/employees/save")
    public ResponseEntity<Void> saveEmployees(@RequestBody List<Employee> employees){
        employeeService.saveEmployees(employees);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/companies/save")
    public ResponseEntity<Void> saveCompany(@RequestBody List<Company> companies){
        companyService.saveCompany(companies);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
