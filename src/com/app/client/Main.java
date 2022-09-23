package com.app.client;

import com.app.bean.Customer;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[2];
        customers[0] = new Customer("23DJG22", "Ananda Magar", "Denver", "303.323.3232");
        customers[1] = new Customer("23DHGFH", "David Smith", "Denver", "320.323.3232");

        for (int i = 0; i < customers.length; i++){
            System.out.println(customers[i].display());
        }

//        for (Customer cus: customers){
//            System.out.println(cus.display());
//        }
    }

}