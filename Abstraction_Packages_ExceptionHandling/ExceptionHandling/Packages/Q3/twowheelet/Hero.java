package Abstraction_Packages_ExceptionHandling.ExceptionHandling.Packages.Q3.twowheelet;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio Facility Available");
    }
}