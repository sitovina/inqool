package com.example.inqool.repository;

import com.example.inqool.model.Court;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourtRepository extends JpaRepository<Court, Long> {
}