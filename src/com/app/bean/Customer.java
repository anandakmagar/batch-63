package com.app.bean;

public class Customer {
    private String custID;
    private String custName;
    private String custLoc;
    private String custPhone;

    public Customer(String custID, String custName, String custLoc, String custPhone) {
        this.custID = custID;
        this.custName = custName;
        this.custLoc = custLoc;
        this.custPhone = custPhone;
    }


    public String display() {
        return "Customer{" +
                "custID='" + custID + '\'' +
                ", custName='" + custName + '\'' +
                ", custLoc='" + custLoc + '\'' +
                ", custPhone='" + custPhone + '\'' +
                '}';
    }
}
