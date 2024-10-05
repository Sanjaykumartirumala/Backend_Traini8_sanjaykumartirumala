package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    // Create a new training center
    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(
            @Valid @RequestBody TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(new Timestamp(System.currentTimeMillis())); // Set server timestamp
        TrainingCenter savedCenter = trainingCenterRepository.save(trainingCenter);
        return ResponseEntity.ok(savedCenter);
    }

    // Get all training centers
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = trainingCenterRepository.findAll();
        return ResponseEntity.ok(centers);
    }
}
