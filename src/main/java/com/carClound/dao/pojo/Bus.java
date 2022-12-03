package com.carClound.dao.pojo;

import java.util.Objects;

public class Bus extends Car{
    private String vehicleId;
    private Integer userId;
    private String brand;
    private Integer seat;
    private Integer price;
    private String date;

    public Bus() {
    }

    public Bus(String vehicleId, Integer userId, String brand, Integer seat, Integer price, String date) {
        this.vehicleId = vehicleId;
        this.userId = userId;
        this.brand = brand;
        this.seat = seat;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "userId=" + userId +
                ", vehicleId='" + vehicleId + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", seat=" + seat +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public String getVehicleId() {
        return vehicleId;
    }

    @Override
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public Integer getUserId() {
        return userId;
    }

    @Override
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Objects.equals(userId, bus.userId) && Objects.equals(vehicleId, bus.vehicleId) && Objects.equals(brand, bus.brand) && Objects.equals(price, bus.price) && Objects.equals(seat, bus.seat) && Objects.equals(date, bus.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, vehicleId, brand, price, seat, date);
    }
}
