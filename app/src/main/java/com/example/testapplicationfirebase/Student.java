package com.example.testapplicationfirebase;

public class Student {
    private String ID;
    private String name;
    private String address;
    private Integer conNo;

    public Student() {
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getConNo() {
        return conNo;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setConNo(Integer conNo) {
        this.conNo = conNo;
    }
}
