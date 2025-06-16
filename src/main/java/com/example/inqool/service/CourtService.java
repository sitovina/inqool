package com.example.inqool.service;

import com.example.inqool.model.Court;
import com.example.inqool.repository.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourtService {

    private final CourtRepository courtRepository;

    @Autowired
    public CourtService(CourtRepository courtRepository) {
        this.courtRepository = courtRepository;
    }

    public List<Court> getAllCourts() {
        return courtRepository.findAll();
    }

    public Optional<Court> getCourtById(Long id) {
        return courtRepository.findById(id);
    }

    public Court createCourt(Court court) {
        return courtRepository.save(court);
    }

    public void deleteCourt(Long id) {
        if (courtRepository.existsById(id)) {
            courtRepository.deleteById(id);
        } else {
            throw new RuntimeException("Court with id: " + id + " not found");
        }
    }

}
