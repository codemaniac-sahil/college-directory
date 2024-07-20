package com.sahil.college_directory_application.College.Directory.services;

import com.sahil.college_directory_application.College.Directory.dto.StudentDTO;
import com.sahil.college_directory_application.College.Directory.dto.UserDTO;
import com.sahil.college_directory_application.College.Directory.entity.StudentEntity;

import com.sahil.college_directory_application.College.Directory.respository.StudentRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    final ModelMapper modelMapper;
    final StudentRepository studentRepository;


    public StudentService(ModelMapper modelMapper, StudentRepository studentRepository) {
        this.modelMapper = modelMapper;
        this.studentRepository = studentRepository;
    }
    // Get All the Users
    public List<StudentDTO> getAllStudent() {
        return studentRepository.findAll().stream()
                .map(studentEntity ->modelMapper.map(studentEntity,StudentDTO.class))
                .collect(Collectors.toList());
    }
    // Get all the user by id
    public StudentDTO getStudentById(Long id){
        StudentEntity studentEntity =studentRepository.getById(id);
        return modelMapper.map(studentEntity,StudentDTO.class);
    }
    // Create a User
    public StudentDTO createStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity =modelMapper.map(studentDTO, StudentEntity.class);
        return modelMapper.map(studentRepository.save(studentEntity),StudentDTO.class);
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
