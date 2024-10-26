package ru.cors.springstudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cors.springstudents.model.Student;
import ru.cors.springstudents.service.StudentService;

import java.util.List;

//https://youtu.be/fL5NDw0rDOI?t=1659
@RestController
@RequestMapping("/api/v1/students")
//https://youtu.be/fL5NDw0rDOI?t=2462
@AllArgsConstructor
public class StudentController {
//    https://youtu.be/fL5NDw0rDOI?t=2327 (про бины)
//    https://youtu.be/fL5NDw0rDOI?t=2212

    private final StudentService service;

//    @Autowired
//    public StudentController(StudentService service) {
//        this.service = service;
//    }

    //    https://youtu.be/fL5NDw0rDOI?t=1977
    @GetMapping
    public List<Student> findAllStudent() {
//        https://youtu.be/fL5NDw0rDOI?t=2185
        //todo
        return service.findAllStudent();
    }
}
