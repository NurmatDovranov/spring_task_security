package com.example.spring_task_security.repository;

import com.example.spring_task_security.entity.Company;


import java.util.List;

public interface CompanyRepository {

    void saveCompany(Company company);

    void updateCompany(Long id,Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompanyById(Long id);
}