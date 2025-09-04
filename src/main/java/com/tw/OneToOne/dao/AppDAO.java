package com.tw.OneToOne.dao;

import com.tw.OneToOne.entity.Course;
import com.tw.OneToOne.entity.Instructor;
import com.tw.OneToOne.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    boolean deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    boolean deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructor(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

}
