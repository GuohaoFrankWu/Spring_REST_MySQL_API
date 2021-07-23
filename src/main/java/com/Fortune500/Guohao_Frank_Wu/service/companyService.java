package com.Fortune500.Guohao_Frank_Wu.service;

import com.Fortune500.Guohao_Frank_Wu.entity.company;

import java.util.List;

public interface companyService {
    List<company> findAll();
    Object findById(int companyID);
    void saveOrUpdate(company theCompany);
    void deleteById(int companyId);
}
