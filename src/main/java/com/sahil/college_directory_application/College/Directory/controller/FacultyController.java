package com.sahil.college_directory_application.College.Directory.controller;

import com.sahil.college_directory_application.College.Directory.dto.FacultyDTO;
import com.sahil.college_directory_application.College.Directory.services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping
    public List<FacultyDTO> getAllFacultyProfiles() {
        return facultyService.getAllFaculty();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacultyDTO> getFacultyById(@PathVariable Long id) {
        FacultyDTO facultyDTO = facultyService.getFacultyById(id);
        if (facultyDTO != null) {
            return ResponseEntity.ok(facultyDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public FacultyDTO createFaculty(@RequestBody FacultyDTO facultyDTO) {
        return facultyService.createFaculty(facultyDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFacultyProfile(@PathVariable Long id) {
        facultyService.deleteFaculty(id);
        return ResponseEntity.noContent().build();
    }
}
