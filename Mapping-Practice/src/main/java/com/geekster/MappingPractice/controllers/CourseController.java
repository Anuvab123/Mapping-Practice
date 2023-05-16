package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Course;
import com.geekster.MappingPractice.services.BookService;
import com.geekster.MappingPractice.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/getCourse")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PutMapping("/update/{courseId}")
    public void updateCourse(@RequestBody Course course,String courseId){
        courseService.updateCourse(course,courseId);
    }
}
