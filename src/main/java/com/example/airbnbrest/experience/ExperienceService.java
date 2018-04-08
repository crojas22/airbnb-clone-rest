package com.example.airbnbrest.experience;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ExperienceService {
    void createExperience(Experience experience);

    Iterable<Experience> getAllExperience();

    Page<Experience> getPerPage(Pageable pageable);

    Optional<Experience> getIndividualExperience(String id);
}
