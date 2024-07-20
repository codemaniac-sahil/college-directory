package com.sahil.college_directory_application.College.Directory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String username;
    private String role;
    private String name;
    private String email;
    private String phone;
}