package com.emerAU.app;

import com.emerAU.model.Department;
import com.emerAU.model.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan(basePackages = "com.emerAU.springAssignment.*")
@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Department dept = (Department) context.getBean("department");
        System.out.print(dept);


    }

}