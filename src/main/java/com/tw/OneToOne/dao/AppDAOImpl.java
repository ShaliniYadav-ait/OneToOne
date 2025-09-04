package com.tw.OneToOne.dao;

import com.tw.OneToOne.entity.Instructor;
import com.tw.OneToOne.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
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

    @Override
    public Instructor findInstructorById(int theId) {
        return theEntityManager.find(Instructor.class, theId);
    }

    @Override
    @Transactional
    public boolean deleteInstructorById(int theId) {
        Instructor tempInstructor = theEntityManager.find(Instructor.class, theId);
        theEntityManager.remove(tempInstructor);
        return true;
    }

    @Override
    public InstructorDetail findInstructorDetailById(int theId) {
        return theEntityManager.find(InstructorDetail.class, theId);
    }

    @Override
    @Transactional
    public boolean deleteInstructorDetailById(int theId) {
        InstructorDetail tempInstructorDetail = theEntityManager.find(InstructorDetail.class, theId);
        theEntityManager.remove(tempInstructorDetail);
        return true;
    }


}
