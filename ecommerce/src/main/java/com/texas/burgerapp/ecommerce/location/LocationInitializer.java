package com.texas.burgerapp.ecommerce.location;

import java.util.ArrayList;

public class LocationInitializer {
    ArrayList<Location> locationList;

    public LocationInitializer() {
        locationList = new ArrayList<>();
        locationList.add(new Location(35.22791,80.8431,"1st Road, Charlotte","9825455547"));
        locationList.add(new Location(55.23791,88.8431,"2st Road, California","9825433547"));
        locationList.add(new Location(45.22791,83.8431,"3rd Road, NewYork","9825455347"));
        locationList.add(new Location(20.22791,65.8231,"4th Road, Texas","9825355547"));
    }

    public void addLocation(Location location){
        locationList.add(location);
    }



    public void removeLocation(String number){
        for(Location loc : locationList){
            if(loc.getPhone().equals(number)){
                locationList.remove(loc);
                System.out.println("Location Deleted");
            }
        }
    }

    public void updateLocation(Double latitude, Double longitude,String number){
        for(Location loc : locationList){
            if(latitude == loc.getLatitude() && longitude==loc.getLongitude()){
                loc.setPhone(number);
                break;
            }
        }
    }

    public ArrayList<Location> getLocationLists(){
        return this.locationList;
    }




}
