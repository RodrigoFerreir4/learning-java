package com.jobs_api.modules.company.useCases;

import com.jobs_api.exceptions.UserFoundException;
import com.jobs_api.modules.company.entities.CompanyEntity;
import com.jobs_api.modules.company.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity){

        this.companyRepository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user)->{
            throw new UserFoundException();
        });

       return this.companyRepository.save(companyEntity);
    }
}
