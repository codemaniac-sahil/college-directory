package com.sahil.college_directory_application.College.Directory.respository;

import com.sahil.college_directory_application.College.Directory.entity.DepartmentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
