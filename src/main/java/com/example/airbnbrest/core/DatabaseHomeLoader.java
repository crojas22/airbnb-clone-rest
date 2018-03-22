//package com.example.airbnbrest.core;
//
//import com.example.airbnbrest.home.Home;
//import com.example.airbnbrest.home.HomeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class DatabaseHomeLoader implements ApplicationRunner{
//    private final HomeService homeService;
//
//    @Autowired
//    public DatabaseHomeLoader(HomeService homeService) {
//        this.homeService = homeService;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Home home = new Home(
//                "Miami", "Florida", "United States", "Loft Studio in the Central Area",
//                "Entire Apartment", "Apartment", "Free cancellation", "per night" ,45, 2, 1, 1
//        );
//        String[] photos = {"/images/homes/home1.jpeg", "/images/homes/home1-2.jpeg"};
//        home.setPhotos(Arrays.asList(photos));
//        this.homeService.createHomeListing(home);
//
//        Home home1 = new Home(
//                "New York", "New York", "United States", "In the historical center of New York",
//                "Entire House","House","Free cancellation","per night",60, 3, 3, 2
//        );
//        String[] photos1 = {"/images/homes/home2-2.jpeg", "/images/homes/home2-1.jpeg"};
//        home1.setPhotos(Arrays.asList(photos1));
//        this.homeService.createHomeListing(home1);
//
//        Home home2 = new Home(
//                "Texas", "Houston", "United States", "Lorem ipsum dolor sit amet",
//                "Entire Condo","Condo", "Free cancellation","per night",95, 3, 3, 2
//        );
//        String[] photos2 = {"/images/homes/home3-2.jpeg", "/images/homes/home3-1.jpeg"};
//        home2.setPhotos(Arrays.asList(photos2));
//        this.homeService.createHomeListing(home2);
//
//        Home home3 = new Home(
//                "Seattle", "Washington", "United States", "Lorem ipsum dolor sit amet",
//                "Entire House", "House", "Free cancellation","per night",45, 1, 1, 1
//        );
//        String[] photos3 = {"/images/homes/home4-2.jpeg", "/images/homes/home4-1.jpeg"};
//        home3.setPhotos(Arrays.asList(photos3));
//        this.homeService.createHomeListing(home3);
//
//        Home home6 = new Home(
//                "Texas", "Houston", "United States", "Lorem ipsum dolor sit amet",
//                "Private Room","Apartment", "Free cancellation","per night",35, 1, 1, 1
//        );
//        String[] photos6 = {"/images/homes/home3-1.jpeg", "/images/homes/home3-2.jpeg"};
//        home6.setPhotos(Arrays.asList(photos6));
//        this.homeService.createHomeListing(home6);
//
//        Home home7 = new Home(
//                "Seattle", "Washington", "United States", "Lorem ipsum dolor sit amet dolor",
//                "Private Room", "House","Free cancellation","per night",40, 1, 1, 1
//        );
//        String[] photos7 = {"/images/homes/home4-1.jpeg", "/images/homes/home4-2.jpeg"};
//        home7.setPhotos(Arrays.asList(photos7));
//        this.homeService.createHomeListing(home7);
//
//        Home home4 = new Home(
//                "Miami", "Florida", "United States", "Loft Studio in the Central Area",
//                "Entire Apartment","Apartment","Free cancellation","per night",45, 2, 1, 1
//        );
//        String[] photos4 = {"/images/homes/home1-2.jpeg", "/images/homes/home1.jpeg"};
//        home4.setPhotos(Arrays.asList(photos4));
//        this.homeService.createHomeListing(home4);
//
//        Home home5 = new Home(
//                "New York", "New York", "United States", "In the historical center of New York",
//                "Entire Home","House","Free cancellation","per night",60, 3, 3, 2
//        );
//        String[] photos5 = {"/images/homes/home2-1.jpeg", "/images/homes/home2-2.jpeg"};
//        home5.setPhotos(Arrays.asList(photos5));
//        this.homeService.createHomeListing(home5);
//    }
//}
