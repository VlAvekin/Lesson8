package com.vladavekin.Tasc2;

public class Vehicle {

    private double Price;

    private double Speed;

    private int YearOfIssue;

    public Vehicle(final double price,
                   final double speed,
                   final int yearOfIssue) {
        Price = price;
        Speed = speed;
        YearOfIssue = yearOfIssue;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        YearOfIssue = yearOfIssue;
    }
}
