package com.sahil.college_directory_application.College.Directory.services;

import com.sahil.college_directory_application.College.Directory.dto.UserDTO;
import com.sahil.college_directory_application.College.Directory.entity.UserEntity;
import com.sahil.college_directory_application.College.Directory.respository.UserRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    final ModelMapper modelMapper;
    final UserRepository userRepository;

    public UserService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    // Get All the Users
    public List<UserDTO> getAllUser() {
        return userRepository.findAll().stream()
                .map(UserEntity ->modelMapper.map(UserEntity,UserDTO.class))
                .collect(Collectors.toList());
    }
// Get all the user by id
    public UserDTO getUserById(Long id){
        UserEntity userEntity =userRepository.getById(id);
        return modelMapper.map(userEntity,UserDTO.class);
    }
    // Create a User
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity =modelMapper.map(userDTO, UserEntity.class);
        return modelMapper.map(userRepository.save(userEntity),UserDTO.class);
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
