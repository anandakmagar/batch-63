package com.app;

import java.util.Scanner;

class CustomerBean {
    private long customerId;
    private String customerName;

    public CustomerBean(long customerId, String customerName) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
class CustomerRepo{
    CustomerBean[] customerBeans = new CustomerBean[1];
    public void addCustomer(){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the customer id");
        long customerId = scnr.nextLong();

        scnr.nextLine();

        System.out.println("Enter the customer name");
        String customerName = scnr.nextLine();

        CustomerBean customerBean = new CustomerBean(customerId, customerName);

        for (int i = 0; i < customerBeans.length; i++){
            customerBeans[i] = customerBean;
            System.out.println("Customer added successfully!");
        }

    }

    public CustomerBean[] viewAllCustomers(){
        for (int i = 0; i < customerBeans.length; i++){
            System.out.println(customerBeans[i].toString());
        }
        return customerBeans;
    }
}

public class CustomerManagement {
    public void menu(){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please select your desired option");

        System.out.println("****************************");
        System.out.println("CUSTOMER MANAGEMENT SYSTEM");
        System.out.println("****************************");
        System.out.println("1. Add Customer");
        System.out.println("2. View All Customers");
        System.out.println("3. Search Customer By ID");
        System.out.println("4. EXIT");


        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        CustomerRepo cr = new CustomerRepo();
        CustomerManagement cm = new CustomerManagement();

        cm.menu();


        int option = scnr.nextInt();
        switch (option) {
            case 1:
                cr.addCustomer();
                cr.addCustomer();
                cr.viewAllCustomers();
                break;
            case 2:
                cr.viewAllCustomers();
                break;
            case 3:

                break;
            case 4:
                System.out.println("You exited the system successfully!!");
                System.exit(0);
                break;
        }
    }
}
