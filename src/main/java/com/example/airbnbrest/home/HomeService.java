package com.example.airbnbrest.home;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HomeService {

    void createHomeListing(Home home);

    Iterable<Home> getHomeListing();

    Page<Home> getPerPage(Pageable pageable);

    Optional<Home> getIndividualHome(String id);
}
