package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Course;
import com.geekster.MappingPractice.repositories.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public void updateCourse(Course course, String courseId) {
        Course course1=courseRepo.findByCourseId(courseId);
        course1.setTitle(course.getTitle());
        course1.setDescription(course.getDescription());
        course1.setCourseId(course.getDescription());
        courseRepo.save(course1);
    }
}
