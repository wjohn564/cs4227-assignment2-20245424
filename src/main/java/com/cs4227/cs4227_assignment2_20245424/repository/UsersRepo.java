package com.cs4227.cs4227_assignment2_20245424.repository;

import com.cs4227.cs4227_assignment2_20245424.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {

    // For creating Login Signature
    Optional<OurUsers> findByEmail(String email);
}
