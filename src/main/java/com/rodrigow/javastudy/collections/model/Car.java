package com.rodrigow.javastudy.collections.model;

public class Car {
    private final String brand;
    private final String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public static Car fit(){
        return new Car("Honda", "Fit");
    }

    public static Car voyage(){
        return new Car("Volkswagen", "Voyage");
    }

}
