package com.demo.springdatajpabatchinsertion.serviceimpl;

import com.demo.springdatajpabatchinsertion.entity.Company;
import com.demo.springdatajpabatchinsertion.repo.CompanyRepo;
import com.demo.springdatajpabatchinsertion.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    @Override
    public void saveCompany(List<Company> companies) {
        int size = companies.size();
        int counter = 0;

        List<Company> temp = new ArrayList<>();
        for(Company cmp : companies){
            temp.add(cmp);
            if ((counter + 1) % 500 == 0 || (counter + 1) == size){
                companyRepo.saveAll(temp);
                temp.clear();
            }
            counter++;
        }
    }
}
