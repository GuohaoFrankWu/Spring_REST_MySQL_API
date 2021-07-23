package com.Fortune500.Guohao_Frank_Wu.dao;

import com.Fortune500.Guohao_Frank_Wu.entity.company;

import java.util.*;

public interface companyDAO {
    List<company> findAll();
    Object findById(int theId);
    void saveOrUpdate(company theCompany);
    void deleteById(int theId);
}
