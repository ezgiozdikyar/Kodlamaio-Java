package com.company;

public class CustomerManager {
    private Customer customer;
    private CreditManager creditManager;
    public CustomerManager(Customer customer, CreditManager creditManager){
        this.customer = customer;
        this.creditManager = creditManager;
    }
    public void Save(){
        System.out.println("Customer saved.");
    }
    public void Delete(){
        System.out.println("Customer deleted.");
    }
    public void GiveCredit(){
        creditManager.Calculate();
        creditManager.Save();
        System.out.println("Credit it given to the customer.");
    }
}
