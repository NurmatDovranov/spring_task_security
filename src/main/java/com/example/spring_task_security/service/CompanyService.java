package com.example.spring_task_security.service;

import com.example.spring_task_security.entity.Company;


import java.util.List;

public interface CompanyService {

    void saveCompany(Company company);

    void updateCompany(Long id,Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompanyById(Long id);

}
