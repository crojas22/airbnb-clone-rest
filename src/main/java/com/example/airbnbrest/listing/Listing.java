package com.example.airbnbrest.listing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Listing {
    @Id
    private String id;

    private String city, state, country, title;

    private List<String> photos;

    {
        photos = new ArrayList<>();
    }

    protected Listing() {
    }

    public Listing(String city,
                   String state,
                   String country,
                   String title) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.title = title;
    }
}
