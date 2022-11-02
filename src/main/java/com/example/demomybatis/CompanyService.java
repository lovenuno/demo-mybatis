package com.example.demomybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    List<Company> getAll(){
        List<Company> companyList = companyMapper.getAll();

        if(companyList != null && companyList.size() > 0){
            for (Company company : companyList) {
                company.setEmployeeList(employeeMapper.getByCompanyId(company.getId()));
            }
        }
        return companyList;
    }

    @Transactional(rollbackFor = Exception.class)
    public Company add(Company company) throws Exception {
        companyMapper.insert(company);

        if(true){
//            throw new RuntimeException("Legacy Exception.");
            throw new Exception("Legacy Exception.");
        }
        return company;
    }
}
