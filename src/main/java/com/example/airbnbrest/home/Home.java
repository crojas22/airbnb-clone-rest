package com.example.airbnbrest.home;

import com.example.airbnbrest.listing.Listing;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "listing", type = "homes")
public class Home extends Listing{

    private String simpleDescription, type, cancellation, typeOfCharge;
    private int price, guests, beds, baths;

    protected Home() {
    }

    public Home(String city,
                String state,
                String country,
                String title,
                String simpleDescription,
                String type,
                String cancellation,
                String typeOfCharge,
                int price,
                int guests,
                int beds,
                int baths) {
        super(city, state, country, title);
        this.simpleDescription = simpleDescription;
        this.type = type;
        this.cancellation = cancellation;
        this.typeOfCharge = typeOfCharge;
        this.price = price;
        this.guests = guests;
        this.beds = beds;
        this.baths = baths;
    }
}
