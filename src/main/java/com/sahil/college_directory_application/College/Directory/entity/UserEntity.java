package com.sahil.college_directory_application.College.Directory.entity;

//import javax.persistence.*;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String phone;


    public enum Role {
        STUDENT,
        FACULTY_MEMBER,
        ADMINISTRATOR
    }
}