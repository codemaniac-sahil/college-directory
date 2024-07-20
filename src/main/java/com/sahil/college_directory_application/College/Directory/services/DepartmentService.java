package com.sahil.college_directory_application.College.Directory.services;

import com.sahil.college_directory_application.College.Directory.dto.DepartmentDTO;
import com.sahil.college_directory_application.College.Directory.entity.DepartmentEntity;
import com.sahil.college_directory_application.College.Directory.respository.DepartmentRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentService {
    final ModelMapper modelMapper;
    final DepartmentRepository departmentRepository;

    public DepartmentService(ModelMapper modelMapper, DepartmentRepository departmentRepository) {
        this.modelMapper = modelMapper;
        this.departmentRepository = departmentRepository;
    }
    public List<DepartmentDTO> getAllDepartment() {
            return departmentRepository.findAll().stream()
                    .map(departmentEntity ->modelMapper.map(departmentEntity,DepartmentDTO.class))
                    .collect(Collectors.toList());
        }
     public DepartmentDTO getDepartmentById(Long id){
            DepartmentEntity departmentEntity =departmentRepository.getById(id);
            return modelMapper.map(departmentEntity,DepartmentDTO.class);


}
 public DepartmentDTO createDepartment(DepartmentDTO departmentDTO){
        DepartmentEntity departmentEntity =modelMapper.map(departmentDTO, DepartmentEntity.class);
        return modelMapper.map(departmentRepository.save(departmentEntity),DepartmentDTO.class);        
    }




    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
