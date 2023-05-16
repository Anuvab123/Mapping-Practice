package com.geekster.MappingPractice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Book {

    @Id
    private String bookID;
    private String title;
    private String author;
    private String description;
    private String bookPrice;

    @ManyToOne
    private Student student;
}
