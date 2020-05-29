package com.olivia.tradition.principles.singleResponsibility;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle rv = new RoadVehicle();
        rv.run("car");
        rv.run("bycicle");

        AirVehicle av = new AirVehicle();
        av.run("plane");


    }
}

// SingleResponsibility2 follow the SingleResponsibility principle
// But it has much cost, need to change a lot
// Improvement: direct change the Vehicle class


class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is flying on the sky");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is diving in the sea");
    }
}