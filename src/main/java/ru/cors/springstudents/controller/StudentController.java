package ru.cors.springstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cors.springstudents.model.Student;

import java.util.List;

//https://youtu.be/fL5NDw0rDOI?t=1659
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

//    https://youtu.be/fL5NDw0rDOI?t=1977
    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Oleg").email("oleg123@gmail.com").age(41).build(),
                Student.builder().firstName("Vasiliy").email("vasiliy123@gmail.com").age(27).build(),
                Student.builder().firstName("Igor").email("igor123@gmail.com").age(35).build()
        );
    }
}
