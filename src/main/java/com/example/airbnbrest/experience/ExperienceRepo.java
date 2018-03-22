package com.example.airbnbrest.experience;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepo extends ElasticsearchRepository<Experience, String> {
}
