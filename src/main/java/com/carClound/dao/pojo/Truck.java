package com.carClound.dao.pojo;

import java.util.Objects;

public class Truck extends Car{
    private String vehicleId;
    private Integer userId;
    private String brand;
    private Integer tonnage;
    private Integer price;
    private String date;

    public Truck() {
    }

    public Truck(String vehicleId, Integer userId, String brand, Integer tonnage, Integer price, String date) {
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.tonnage = tonnage;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "vehicleId='" + vehicleId + '\'' +
                ", userId=" + userId +
                ", brand='" + brand + '\'' +
                ", tonnage=" + tonnage +
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

    public Integer getTonnage() {
        return tonnage;
    }

    public void setTonnage(Integer tonnage) {
        this.tonnage = tonnage;
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
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Objects.equals(userId, truck.userId) && Objects.equals(vehicleId, truck.vehicleId) && Objects.equals(brand, truck.brand) && Objects.equals(tonnage, truck.tonnage) && Objects.equals(price, truck.price) && Objects.equals(date, truck.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, vehicleId, brand, tonnage, price, date);
    }
}
