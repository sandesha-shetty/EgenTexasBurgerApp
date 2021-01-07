package com.texas.burgerapp.ecommerce;

import com.texas.burgerapp.ecommerce.location.LocationImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Egen Burger Restaurant" );
        Scanner scanner = new Scanner(System.in);
        LocationImpl locationImpl = new LocationImpl();

        while(true){
            System.out.println("Select appropriate field for which action is needed" +
                    "" + "1. Location , 2. Menu");
            int actionSelected = scanner.nextInt();
            switch(actionSelected) {

                case 1:
                    System.out.println("Kindly select your course of action by choosing an appropriate number :  1. Update Location, 2. Delete Location, 3. Add Location, 4. Show all locations");
                    int locationvalue = scanner.nextInt();

                    switch (locationvalue) {

                        case 1:
                            locationImpl.updateLocation();
                            break;
                        case 2:
                            locationImpl.deleteLocation();
                            break;
                        case 3:
                            locationImpl.addLocation();
                            break;
                        case 4:
                            locationImpl.dispayLocation();
                            break;
                        default:
                            System.out.print(" Incorrect input entered ");
                    }

                    break;
            }
        }

    }
}
