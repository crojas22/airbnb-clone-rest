package com.example.airbnbrest.experience;

import java.util.Optional;

public interface ExperienceService {
    void createExperience(Experience experience);

    Iterable<Experience> getAllExperience();

    Optional<Experience> getIndividualExperience(String id);
}
