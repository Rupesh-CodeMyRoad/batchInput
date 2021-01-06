package com.demo.springdatajpabatchinsertion.serviceimpl;

import com.demo.springdatajpabatchinsertion.entity.Employee;
import com.demo.springdatajpabatchinsertion.repo.EmployeeRepo;
import com.demo.springdatajpabatchinsertion.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void saveEmployees(List<Employee> employees) {
        int size = employees.size();
        int counter = 0;

        List<Employee> temp = new ArrayList<>();
        for(Employee emp : employees){
            temp.add(emp);
            if ((counter + 1) % 500 == 0 || (counter + 1) == size){
                employeeRepo.saveAll(temp);
                temp.clear();
            }
            counter++;
        }
    }
}
