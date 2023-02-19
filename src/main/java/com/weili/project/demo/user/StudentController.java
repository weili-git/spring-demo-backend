package com.weili.project.demo.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class StudentController {
    @CrossOrigin
    @GetMapping("users")
    public List<Student> getStudent(){
        return List.of(
                new Student(UUID.randomUUID(),
                        "James",
                        "Bond",
                        "jamesbond@gmail.com",
                        Student.Gender.MALE),
                new Student(UUID.randomUUID(),
                        "Elisa",
                        "Tamara",
                        "elisatamara@gmail.com",
                        Student.Gender.FEMALE)
        );
    }
}
