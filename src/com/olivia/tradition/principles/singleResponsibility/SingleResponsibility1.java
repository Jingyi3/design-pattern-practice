package com.olivia.tradition.principles.singleResponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run("Moto");
        v.run("Car");
        v.run("Plane");
    }

}


class Vehicle {
    // in this method, it takes more than one responsibility
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road.");
    }
}