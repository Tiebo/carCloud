package com.carClound.dao.pojo;

import java.util.Objects;

public class Car {
    private String vehicleId;
    private Integer userId;
    private String brand;
    private String type;
    private Integer price;
    private String date;

    public Car() {
    }

    public Car(String vehicleId, Integer userId, String brand, String type, Integer price, String date) {
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.date = date;
    }

    public Car(String vehicleId, Integer userId, String brand, Integer price, String date) {
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleId='" + vehicleId + '\'' +
                ", userId=" + userId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(userId, car.userId) && Objects.equals(vehicleId, car.vehicleId) && Objects.equals(brand, car.brand) && Objects.equals(type, car.type) && Objects.equals(price, car.price) && Objects.equals(date, car.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, vehicleId, brand, type, price, date);
    }
}
