package com.example.projectmanagement.PMJ.repository;

import com.example.projectmanagement.PMJ.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
