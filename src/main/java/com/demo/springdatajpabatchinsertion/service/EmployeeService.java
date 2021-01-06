package com.demo.springdatajpabatchinsertion.service;

import com.demo.springdatajpabatchinsertion.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployees(List<Employee> employees);
}
