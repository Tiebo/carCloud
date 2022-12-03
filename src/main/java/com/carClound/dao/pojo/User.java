package com.carClound.dao.pojo;

public class User {
    private Integer id;
    private String name;
    private String account;
    private String password;
    private String rentCar;
    private Integer balance;
    private String gender;
    private Integer isAdmin;


    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(Integer id, String name, String account, String password, String rentCar, Integer balance, String gender, Integer isAdmin) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.isAdmin = isAdmin;
        this.rentCar = rentCar;
        this.balance = balance;
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRentCar() {
        return rentCar;
    }

    public void setRentCar(String rentCar) {
        this.rentCar = rentCar;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", rentCar='" + rentCar + '\'' +
                ", balance=" + balance +
                ", gender='" + gender + '\'' +
                '}';
    }
}
