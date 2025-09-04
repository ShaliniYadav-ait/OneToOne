package com.tw.OneToOne.dao;

import com.tw.OneToOne.entity.Course;
import com.tw.OneToOne.entity.Instructor;
import com.tw.OneToOne.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

        tempInstructorDetail.getInstructor().setInstructorDetail(null);
        theEntityManager.remove(tempInstructorDetail);
        return true;
    }

    @Override
    public List<Course> findCoursesByInstructor(int theId) {
        TypedQuery<Course> query = theEntityManager.createQuery("from Course where instructor.id = :data", Course.class);

        query.setParameter("data", theId);
        List<Course> courses = query.getResultList();
        return courses;
    }

    @Override
    public Instructor findInstructorByIdJoinFetch(int theId) {
        TypedQuery<Instructor> query = theEntityManager.createQuery(
                "select i from Instructor i"
                        + "JOIN FETCH i.courses "
                        + "wherei.id = :data", Instructor.class);

        query.setParameter("data", theId);
        Instructor instructor = query.getSingleResult();
        return instructor;
    }


}
