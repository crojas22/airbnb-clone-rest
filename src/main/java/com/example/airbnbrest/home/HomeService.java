package com.example.airbnbrest.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HomeService {
    private final HomeRepo homesRepo;

    @Autowired
    public HomeService(HomeRepo homesRepo) {
        this.homesRepo = homesRepo;
    }

    public void createHomeListing(Home home) {
        this.homesRepo.save(home);
    }

    public Iterable<Home> getHomeListing() {
        return this.homesRepo.findAll();
    }

    public Optional<Home> getIndividualHome(String id) {
        return this.homesRepo.findById(id);
    }
}
