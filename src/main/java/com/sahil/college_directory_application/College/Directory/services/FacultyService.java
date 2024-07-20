package com.sahil.college_directory_application.College.Directory.services;

import com.sahil.college_directory_application.College.Directory.dto.FacultyDTO;
import com.sahil.college_directory_application.College.Directory.dto.StudentDTO;
import com.sahil.college_directory_application.College.Directory.dto.UserDTO;
import com.sahil.college_directory_application.College.Directory.entity.FacultyEntity;
import com.sahil.college_directory_application.College.Directory.entity.StudentEntity;
import com.sahil.college_directory_application.College.Directory.respository.FacultyRepository;
import com.sahil.college_directory_application.College.Directory.respository.StudentRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class FacultyService {
    final ModelMapper modelMapper;
    final FacultyRepository facultyRepository;

    public FacultyService(ModelMapper modelMapper, StudentRepository studentRepository, FacultyRepository facultyRepository) {
        this.modelMapper = modelMapper;


        this.facultyRepository = facultyRepository;
    }
    // Get All the Users
    public List<FacultyDTO> getAllFaculty() {
        return facultyRepository.findAll().stream()
                .map(facultyEntity ->modelMapper.map(facultyEntity,FacultyDTO.class))
                .collect(Collectors.toList());
    }
    // Get all the user by id
    public FacultyDTO getFacultyById(Long id){
        FacultyEntity facultyEntity =facultyRepository.getById(id);
        return modelMapper.map(facultyEntity,FacultyDTO.class);
    }
    // Create a User
    public FacultyDTO createFaculty(FacultyDTO facultyDTO){
        FacultyEntity facultyEntity =modelMapper.map(facultyDTO, FacultyEntity.class);
        return modelMapper.map(facultyRepository.save(facultyEntity),FacultyDTO.class);
    }
    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }

}
