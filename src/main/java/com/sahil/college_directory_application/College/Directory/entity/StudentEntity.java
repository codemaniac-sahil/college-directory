package com.sahil.college_directory_application.College.Directory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student_profiles")
@Data
public class StudentEntity {
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Year year;

    public enum Year {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR,
        GRADUATE
    }
}
