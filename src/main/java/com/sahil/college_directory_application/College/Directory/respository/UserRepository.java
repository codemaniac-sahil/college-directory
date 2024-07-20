package com.sahil.college_directory_application.College.Directory.respository;

import com.sahil.college_directory_application.College.Directory.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
