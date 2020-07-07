package com.practice;

public class Vehicle {
    private static final int steer = 90;
    private static int gear = 6;
    private static int speed = 200;

    public static void getSteer() {
        System.out.println("Car is steering at " + steer + " degrees");
    }

    public void setSteer(int steer) {
    }

    public  void getGear() {
        System.out.println("Car is moving on " + gear + "th gear");
    }

    public static void setGear(int gear) {
        Vehicle.gear = gear;
    }

    public static void getSpeed() {
        System.out.println("Car is moving at a speed of " + speed + " miles per hour");
    }

    public static void setSpeed(int speed) {
        Vehicle.speed = speed;
    }
}
