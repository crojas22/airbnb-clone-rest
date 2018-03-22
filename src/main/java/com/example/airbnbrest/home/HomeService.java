package com.example.airbnbrest.home;

import java.util.Optional;

public interface HomeService {

    void createHomeListing(Home home);

    Iterable<Home> getHomeListing();

    Optional<Home> getIndividualHome(String id);
}
