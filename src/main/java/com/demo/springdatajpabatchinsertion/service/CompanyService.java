package com.demo.springdatajpabatchinsertion.service;

import com.demo.springdatajpabatchinsertion.entity.Company;

import java.util.List;

public interface CompanyService {
    void saveCompany(List<Company> companies);
}
