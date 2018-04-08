package com.example.airbnbrest.web.controller;

import com.example.airbnbrest.experience.ExperienceService;
import com.example.airbnbrest.home.Home;
import com.example.airbnbrest.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1")
public class ListingController {
    private final HomeService homeService;
    private final ExperienceService experienceService;

    @Autowired
    public ListingController(HomeService homeService,
                             ExperienceService experienceService) {
        this.homeService = homeService;
        this.experienceService = experienceService;
    }

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getHomeData() {
        Map<String, Object> responseBody = new HashMap<>();
        try {
            responseBody.put("homeListing", this.homeService.getPerPage(PageRequest.of(0,8)));
            responseBody.put("experienceListing", this.experienceService.getPerPage(PageRequest.of(0,8)));
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("error", e);
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/search/home", method = RequestMethod.GET)
    public ResponseEntity searchHomeData() {
        try {
            return new ResponseEntity<>(this.homeService.getPerPage(PageRequest.of(0,12)), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
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

    @RequestMapping(value = "/experience/{id}", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getIndividualExperience(@PathVariable String id) {
        Map<String, Object> responseBody = new HashMap<>();
        try {
            responseBody.put("listing", this.experienceService.getIndividualExperience(id));
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("error", e);
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }
}
