package ru.cors.springstudents.service;

import org.springframework.stereotype.Service;
import ru.cors.springstudents.model.Student;

import java.util.List;

//https://youtu.be/fL5NDw0rDOI?t=2140
@Service
public class StudentService {
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Oleg").email("oleg123@gmail.com").age(41).build(),
                Student.builder().firstName("Vasiliy").email("vasiliy123@gmail.com").age(27).build(),
                Student.builder().firstName("Igor").email("igor123@gmail.com").age(35).build()
        );
    }


}
