package com.Fortune500.Guohao_Frank_Wu.service;

import com.Fortune500.Guohao_Frank_Wu.dao.companyDAO;
import com.Fortune500.Guohao_Frank_Wu.entity.company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class companyServiceIMPL implements companyService{

    private final companyDAO companydAO;

    @Autowired
    public companyServiceIMPL(companyDAO companydAO) {
        this.companydAO = companydAO;
    }

    @Override
    public List<company> findAll() {
        return companydAO.findAll();
    }

    @Override
    public Object findById(int companyID) {
        return companydAO.findById(companyID);
    }

    @Override
    public void saveOrUpdate(company theCompany) {
        companydAO.saveOrUpdate(theCompany);
    }

    @Override
    public void deleteById(int companyId) {
        companydAO.deleteById(companyId);
    }
}
