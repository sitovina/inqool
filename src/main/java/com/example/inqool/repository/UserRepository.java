package com.example.inqool.repository;

import com.example.inqool.model.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Club, Long> {
}