package com.example.inqool.controller;

import com.example.inqool.model.Court;
import com.example.inqool.service.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courts")
public class CourtController {
    @Autowired
    private CourtService courtService;

    @GetMapping("/show")
    public List<Court> getAllCourts() {
        return courtService.getAllCourts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Court> getCourtById(@PathVariable Long id) {
        Optional<Court> court = courtService.getCourtById(id);
        return court.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Court createCourt(@RequestBody Court court) {
        return courtService.createCourt(court);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourt(@PathVariable Long id) {
        courtService.deleteCourt(id);
        return ResponseEntity.noContent().build();
    }
}
