package com.sahil.college_directory_application.College.Directory.respository;

import com.sahil.college_directory_application.College.Directory.entity.FacultyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<FacultyEntity, Long> {
}
