package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Student;
import com.geekster.MappingPractice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/save")
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        return studentService.getStudents();
    }

    @PutMapping("/update/{studentId}")
    public void updateStudent(@RequestBody Student student,@PathVariable String studentId){
        studentService.updateStudent(student,studentId);
    }
}
