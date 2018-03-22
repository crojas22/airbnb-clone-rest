package com.example.airbnbrest.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienceServiceImpl implements ExperienceService {
    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceServiceImpl(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    @Override
    public void createExperience(Experience experience) {
        this.experienceRepo.save(experience);
    }

    @Override
    public Iterable<Experience> getAllExperience() {
        return this.experienceRepo.findAll();
    }

    @Override
    public Optional<Experience> getIndividualExperience(String id) {
        return this.experienceRepo.findById(id);
    }
}
