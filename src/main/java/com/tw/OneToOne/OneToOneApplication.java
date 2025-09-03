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
        };
    }
//
//    private void createInstructor(AppDAO appDAO) {
//        Instructor tempInstructor = new Instructor("Shalini", "Yadav", "shal123434@gmail.com");
//        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com/enigmaShali", "Drawing");
//        tempInstructor.setInstructorDetail(tempInstructorDetail);
//        System.out.println("Saving " + tempInstructor);
//        appDAO.save(tempInstructor);
//    }
}
