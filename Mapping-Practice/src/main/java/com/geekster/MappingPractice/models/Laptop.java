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
public class Laptop{
    @Id
    private String laptopId;
    private String laptopName;
    private String brand;
    private Integer laptopPrice;

    @OneToOne(mappedBy = "laptop")
    private Student student;
}