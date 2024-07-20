package com.sahil.college_directory_application.College.Directory.respository;

import com.sahil.college_directory_application.College.Directory.entity.StudentEntity;
import com.sahil.college_directory_application.College.Directory.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
