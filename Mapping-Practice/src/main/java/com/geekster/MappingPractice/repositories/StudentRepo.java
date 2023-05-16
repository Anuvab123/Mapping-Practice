package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {
    Student findByStudentId(String studentId);
}
