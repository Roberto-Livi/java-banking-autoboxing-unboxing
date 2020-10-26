package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Florida Bank");

        if(bank.addBranch("Miami")){
            System.out.println("Miami branch created");
        }

        bank.addCustomer("Miami", "Jin", 50.95);
        bank.addCustomer("Miami", "Johan", 175.34);
        bank.addCustomer("Miami", "Henry", 220.12);

        bank.addBranch("Tampa");
        bank.addCustomer("Tampa", "John", 150.54);

        bank.addCustomerTransaction("Miami", "Jin", 44.22);
        bank.addCustomerTransaction("Miami", "Lleyton", 12.44);
        bank.addCustomerTransaction("Miami", "Henry", 1.65);

        bank.listCustomers("Miami", true);
        bank.listCustomers("Tampa", true);

        bank.addBranch("Orlando");

        if(!bank.addCustomer("Orlando", "Brian", 5.53)){
            System.out.println("Error Orlando branch does not exist");
        }

        if(!bank.addBranch("Miami")) {
            System.out.println("Miami branch already exists");
        }

        if(!bank.addCustomerTransaction("Miami", "James", 52.33)){
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Miami", "Johan", 12.21)) {
            System.out.println("Customer Johan already exists");
        }
    }
}
