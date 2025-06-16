package com.example.inqool.model.repository;

import com.example.inqool.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Club, Long> {
}