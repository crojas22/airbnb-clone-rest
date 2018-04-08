package com.example.airbnbrest.home;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepo extends ElasticsearchRepository<Home, String> {
    Page<Home> findAll(Pageable pageable);
}
