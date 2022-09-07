package com.example.spring_task_security.service.serviceimpl;

import com.example.spring_task_security.entity.Company;
import com.example.spring_task_security.repository.CompanyRepository;
import com.example.spring_task_security.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public void saveCompany(Company company) {
        companyRepository.saveCompany(company);
    }

    @Override
    public void updateCompany(Long id,Company company) {
        companyRepository.updateCompany(id,company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.getAllCompanies();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.getCompanyById(id);
    }

    @Override
    public void deleteCompanyById(Long id) {
        companyRepository.deleteCompanyById(id);
    }
}
