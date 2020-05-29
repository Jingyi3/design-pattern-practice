package com.olivia.tradition.principles.singleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 v2 = new Vehicle2();
        v2.run("car");
        v2.runAir("plane");
        v2.runWater("ship");
    }

}


// SingleResponsibility3 does not decompose the class but the methods, it does not change a lot from the first try, it only add more methods
// Although it not follows the SingleResponsibility principle on class level but follow it on method level
// SingleResponsibility -- means every one has only one responsibility

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road.");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " is flying on the sky.");
    }


    public void runWater(String vehicle) {
        System.out.println(vehicle + " is diving in the sea.");
    }
}