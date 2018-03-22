package com.example.airbnbrest.experience;

import com.example.airbnbrest.listing.Listing;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "experience", type = "experiences")
public class Experience extends Listing{
    private String simpleDescription, municipality, length, language, typeOfCharge;
    private int price;

    protected Experience() {
    }

    public Experience(String city,
                      String state,
                      String country,
                      String title,
                      String simpleDescription,
                      String municipality,
                      String length,
                      String language,
                      String typeOfCharge,
                      int price) {
        super(city, state, country, title);
        this.simpleDescription = simpleDescription;
        this.municipality = municipality;
        this.length = length;
        this.language = language;
        this.typeOfCharge = typeOfCharge;
        this.price = price;
    }
}
