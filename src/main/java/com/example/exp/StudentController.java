package com.example.exp;

import com.example.exp.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //4 crear response entity
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") String id) {
        Student student = this.studentService.getStudentByID(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        throw new ApiRequestException("Ops can not get all the students.");
        //throw new IllegalStateException("oOPS");
    }
}
