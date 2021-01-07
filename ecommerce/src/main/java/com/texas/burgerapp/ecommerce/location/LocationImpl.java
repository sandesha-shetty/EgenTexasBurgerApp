package com.texas.burgerapp.ecommerce.location;

import java.util.Scanner;

public class LocationImpl implements ILocation {
    Scanner scanner;
    Location location;
    LocationInitializer locationInitializer;

    public LocationImpl(){
        scanner = new Scanner(System.in);
        location = new Location();
        locationInitializer = new LocationInitializer();

    }

    @Override
    public void addLocation() {

        System.out.println("Enter the Latitude of the location: ");
        Double latitude = scanner.nextDouble();

        System.out.println("Enter the Longitude of the location: ");
        Double longitude = scanner.nextDouble();

        System.out.println("Enter the  address of the location: ");
        scanner.nextLine();
        String address = scanner.nextLine();

        System.out.println("Enter the Phone number of the location ");
        String phoneNumber = scanner.nextLine();

        Location location = new Location(longitude,latitude,address.trim(),phoneNumber.trim());
        this.locationInitializer.addLocation(location);

        System.out.println("Location added");
    }

    @Override
    public void deleteLocation() {

        System.out.println("Enter the phoneNumber of Location that needs to be deleted: ");
        String phoneNumber = scanner.nextLine().trim();


        this.locationInitializer.removeLocation(phoneNumber);

        System.out.println("Successfully removed the Location ");
    }

    @Override
    public void updateLocation() {

        System.out.println("Enter the Latitude for updating the restaurant: ");
        Double latitude = scanner.nextDouble();

        System.out.println("Enter the Longitude for updating the restaurant: ");
        Double longitude = scanner.nextDouble();

        System.out.println("Enter the phnnum that needs be updated: ");
        scanner.nextLine();
        String phnnum = scanner.nextLine().trim();

        this.locationInitializer.updateLocation(latitude,longitude, phnnum);

        System.out.println("Successfully updated the phone number of the restaurant");
    }

    @Override
    public void dispayLocation() {
        System.out.println("The Stores are present in the following Locations");
        for(Location loc : this.locationInitializer.getLocationLists()){
            System.out.println("Address:\t" + loc.getAddress() + "Phone:\t" + loc.getPhone());
        }
    }

}
