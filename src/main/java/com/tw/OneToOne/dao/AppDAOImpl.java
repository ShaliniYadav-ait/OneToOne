package com.tw.OneToOne.dao;

import com.tw.OneToOne.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class AppDAOImpl implements AppDAO {

    private final EntityManager theEntityManager;

    @Autowired
    public AppDAOImpl(EntityManager theEntityManager) {
        this.theEntityManager = theEntityManager;
    }


    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        theEntityManager.persist(theInstructor);
    }
}
