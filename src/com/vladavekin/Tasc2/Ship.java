package com.vladavekin.Tasc2;

public class Ship {

    private int numberOfPassengers;

    private String portOfRegistration;

    public Ship(final int numberOfPassengers,
                final String portOfRegistration) {
        this.numberOfPassengers = numberOfPassengers;
        this.portOfRegistration = portOfRegistration;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getPortOfRegistration() {
        return portOfRegistration;
    }

    public void setPortOfRegistration(String portOfRegistration) {
        this.portOfRegistration = portOfRegistration;
    }
}
