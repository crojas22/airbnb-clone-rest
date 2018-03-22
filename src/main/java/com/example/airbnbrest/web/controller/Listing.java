package com.example.airbnbrest.web.controller;

import com.example.airbnbrest.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1")
public class Listing {
    private final HomeService homeService;

    @Autowired
    public Listing(HomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getHomeData() {
        Map<String, Object> responseBody = new HashMap<>();
        try {
            responseBody.put("homeListing", this.homeService.getHomeListing());
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("error", e);
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/home/{id}", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getIndividualHome(@PathVariable String id) {
        Map<String, Object> responseBody = new HashMap<>();
        try {
            responseBody.put("listing", this.homeService.getIndividualHome(id));
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("error", e);
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }
}
