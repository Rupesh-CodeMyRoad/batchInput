package com.demo.springdatajpabatchinsertion.repo;

import com.demo.springdatajpabatchinsertion.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Long> {
}
