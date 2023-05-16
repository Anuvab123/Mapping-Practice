package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Student;
import com.geekster.MappingPractice.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public void updateStudent(Student student, String studentId) {
        Student student1=studentRepo.findByStudentId(studentId);
        student1.setStudentName(student.getStudentName());
        student1.setStudentAge(student.getStudentAge());
        student1.setBranch(student.getBranch());
        student1.setDepartment(student.getDepartment());
        student1.setPhoneNumber(student.getPhoneNumber());
        studentRepo.save(student1);
    }
}
