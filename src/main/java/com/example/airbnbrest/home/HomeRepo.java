package com.example.airbnbrest.home;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepo extends ElasticsearchRepository<Home, String> {
}
