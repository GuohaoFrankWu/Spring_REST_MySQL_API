package com.Fortune500.Guohao_Frank_Wu.dao;


import com.Fortune500.Guohao_Frank_Wu.entity.company;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class companyIMPL implements companyDAO{

    //Define field for entity manager
    /*The EntityManager API is used to create and remove persistent entity instances,
        to find entities by their primary key, and to query over entities. */
    private final EntityManager entityManager;

    //Set up constructor injection
    @Autowired
    public companyIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public List<company> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<company> myQuery = currentSession.createQuery("from company");
        return myQuery.getResultList();
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public Object findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(company.class, theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(company theCompany) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theCompany);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        company myCompany = currentSession.get(company.class, theId);
        currentSession.delete(myCompany);
    }
}
