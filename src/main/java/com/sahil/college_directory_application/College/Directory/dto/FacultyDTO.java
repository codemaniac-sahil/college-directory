package com.sahil.college_directory_application.College.Directory.dto;

import lombok.Data;

@Data
public class FacultyDTO {
    private Long id;
    private Long userId;
    private String photo;
    private Long departmentId;
    private String officeHours;
}
