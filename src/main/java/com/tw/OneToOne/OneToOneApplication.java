package com.tw.OneToOne;

import com.tw.OneToOne.dao.AppDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToOneApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
//            createInstructor(appDAO);
//            findInstructor(appDAO);
//            deleteInstructor(appDAO);
//            findInstructorDetail(appDAO);
//            deleteIntructorDetail(appDAO);
//            createInstructorWithCourses(appDAO);
//            findInstructorWithCourses(appDAO);
//            findCoursesForInstructor(appDAO);
//            findInstructorWithCoursesJoinFetch(appDAO);
//            updateInstructor(appDAO);
//            updateCourse(appDAO);
//            deleteTheCourse(appDAO);
        };
    }

//    private void deleteTheCourse(AppDAO appDAO) {
//        int theId = 12;
//        System.out.println("Finding the course by id : " + theId);
//        appDAO.deleteCourseById(theId);
//        System.out.println("Done");
//    }
//
//    private void updateCourse(AppDAO appDAO) {
//        int theId = 11;
//        System.out.println("Finding the course by id : " + theId);
//        Course theCourse = appDAO.findCourseById(theId);
//        System.out.println("Found course : " + theCourse);
//        theCourse.setTitle("Dance");
//        System.out.println("Course is now : " + theCourse.getTitle());
//        appDAO.updateCourse(theCourse);
//        System.out.println("Done");
//    }

//    private void updateInstructor(AppDAO appDAO) {
//        int theId = 1;
//        Instructor theInstructor = appDAO.findInstructorById(theId);
//        System.out.println("First name is : " + theInstructor.getFirstName());
//        System.out.println("Last name is : " + theInstructor.getLastName());
//        theInstructor.setFirstName("Avyukt");
//        theInstructor.setLastName("Vats");
//        appDAO.update(theInstructor);
//        System.out.println("First name is : " + theInstructor.getFirstName());
//        System.out.println("Last name is : " + theInstructor.getLastName());
//
//        System.out.println("Updated!");
//    }

//    private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
//        int theId = 1;
//        System.out.println("Finding Instructor : " + theId);
//        Instructor instructor = appDAO.findInstructorByIdJoinFetch(theId);
//        System.out.println("Instructor is : " + instructor);
//        System.out.println("Courses  : " + instructor.getCourses());
//        System.out.println("done");
//    }

//    private void findCoursesForInstructor(AppDAO appDAO) {
//        int theId = 1;
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//        System.out.println("temp instructor is : " + tempInstructor);
//        List<Course> courses = appDAO.findCoursesByInstructor(theId);
//        tempInstructor.setCourses(courses);
//        System.out.println("Courses are : " + tempInstructor.getCourses());
//    }

//    private void findInstructorWithCourses(AppDAO appDAO) {
//        int theId = 1;
//        System.out.println("Finding " + theId);
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//        System.out.println("temp Instructor : " + tempInstructor);
//        System.out.println("Courses : " + tempInstructor.getCourses());
//        System.out.println("Done");
//    }

//    private void createInstructorWithCourses(AppDAO appDAO) {
//        Instructor tempInstructor = new Instructor("Abhishek", "Jha", "abhi123434@gmail.com");
//        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com/enigma2", "Cricket");
//        tempInstructor.setInstructorDetail(tempInstructorDetail);
//
//        Course tempCourse = new Course("Air Guitar");
//        Course tempCourse2 = new Course("Keybraod");
//        Course tempCourse3 = new Course("Chess");
//
//        tempInstructor.add(tempCourse);
//        tempInstructor.add(tempCourse2);
//        tempInstructor.add(tempCourse3);
//
//        System.out.println("Saving " + tempInstructor);
//        System.out.println("Courses are : " + tempInstructor.getCourses());
//        appDAO.save(tempInstructor);
//    }

//    private void deleteIntructorDetail(AppDAO appDAO) {
//        int theId = 4;
//        System.out.println("Deleting : " + theId);
//        appDAO.deleteInstructorDetailById(theId);
//        System.out.println("Deleted");
//    }

//    private void findInstructorDetail(AppDAO appDAO) {
//        int theId = 3;
//        System.out.println("Finding : " + theId);
//        InstructorDetail tempInstructorDetails = appDAO.findInstructorDetailById(theId);
//        System.out.println("Details are : " + tempInstructorDetails);
//        System.out.println("Instructor is : " + tempInstructorDetails.getInstructor());
//    }

//    private void deleteInstructor(AppDAO appDAO) {
//        int theId = 1;
//        System.out.println("Deleting id : " + theId);
//        appDAO.deleteInstructorById(theId);
//        System.out.println("Deleted!");
//    }

    //    private void findInstructor(AppDAO appDAO) {
//        int theId = 1;
//        System.out.println("Finding id : " + theId);
//        Instructor tempInstructor = appDAO.findInstructorById(theId);
//        System.out.println("Instructor is : " + tempInstructor);
//    }
//
//    private void createInstructor(AppDAO appDAO) {
//        Instructor tempInstructor = new Instructor("Abhishek", "Jha", "abhi123434@gmail.com");
//        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com/enigma2", "Cricket");
//        tempInstructor.setInstructorDetail(tempInstructorDetail);
//        System.out.println("Saving " + tempInstructor);
//        appDAO.save(tempInstructor);
//    }
}
