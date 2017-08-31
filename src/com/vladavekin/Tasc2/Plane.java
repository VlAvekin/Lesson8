package com.vladavekin.Tasc2;

public class Plane {

    private double height;

    private int numberOfPassengers;

    public Plane(double height, int numberOfPassengers) {
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
