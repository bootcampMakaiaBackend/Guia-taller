package com.example.exp;

import com.example.exp.exception.ApiRequestException;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    public Student getStudentByID(String id) {
        if(id.equals("1234")){
            throw new ApiRequestException("Id debe de ser diferente null");
        }
        return new Student("juan");
    }
}
