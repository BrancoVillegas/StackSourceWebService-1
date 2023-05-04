package com.example.stacksourcewebservice.service.impl;

import com.example.stacksourcewebservice.entities.Company;
import com.example.stacksourcewebservice.repository.ICompanyRepository;
import com.example.stacksourcewebservice.service.ICompanyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CompanyServiceImpl implements ICompanyService {

    private final ICompanyRepository _companyRepository;

    public CompanyServiceImpl(ICompanyRepository companyRepository) {
        _companyRepository = companyRepository;
    }

    @Override
    @Transactional
    public Company save(Company company) throws Exception {
        return _companyRepository.save(company);
    }

    @Override
    @Transactional
    public void delete(Long id) throws Exception {
        _companyRepository.deleteById(id);
    }

    @Override
    public List<Company> getAll() throws Exception {
        return _companyRepository.findAll();
    }

    @Override
    public Optional<Company> getById(Long id) throws Exception {
        return _companyRepository.findById(id);
    }
}
