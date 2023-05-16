package com.company;

public class CarData {
    private String yearOfRelease;
    private String color;
    private String model;
    private String price;

    public CarData() {
    }

    public CarData(String yearOfRelease, String color, String model, String price) {
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "yearOfRelease='" + yearOfRelease + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
