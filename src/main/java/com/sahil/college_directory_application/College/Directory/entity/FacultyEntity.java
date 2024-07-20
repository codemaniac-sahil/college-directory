package com.sahil.college_directory_application.College.Directory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "faculty_profiles")
@Data
public class FacultyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private DepartmentEntity department;

    private String officeHours;
}
