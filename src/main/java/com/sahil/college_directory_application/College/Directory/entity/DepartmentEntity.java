package com.sahil.college_directory_application.College.Directory.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "departments")
@Data
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;
}
