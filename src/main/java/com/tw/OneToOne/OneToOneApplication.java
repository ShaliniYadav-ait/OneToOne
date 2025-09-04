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
        };
    }

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
