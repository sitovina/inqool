package com.example.inqool.repository;

import com.example.inqool.model.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourtRepository extends JpaRepository<Club, Long> {
}