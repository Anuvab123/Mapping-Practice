package com.geekster.MappingPractice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Course {

    @Id
    private String courseId;
    private String title;
    private String description;
    private String duration;

    @OneToMany()
    private List<Student> studentList;

}
