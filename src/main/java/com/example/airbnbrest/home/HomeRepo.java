package com.example.airbnbrest.home;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface HomeRepo extends ElasticsearchRepository<Home, String> {
}
