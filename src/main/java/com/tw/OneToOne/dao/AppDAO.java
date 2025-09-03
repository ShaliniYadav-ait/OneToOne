package com.tw.OneToOne.dao;

import com.tw.OneToOne.entity.Instructor;
import com.tw.OneToOne.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    boolean deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
}
