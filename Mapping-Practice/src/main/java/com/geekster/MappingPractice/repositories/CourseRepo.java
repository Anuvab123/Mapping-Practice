package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String> {
    Course findByCourseId(String courseId);
}
