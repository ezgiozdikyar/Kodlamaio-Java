package com.company;

public class Main {

    public static void main(String[] args) {
        //Testing customer
        Customer person = new Company();

        //Testing Teacher Credit
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();
        //Testing Military Credit
        CustomerManager customerManager2 = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager2.GiveCredit();

    }
}
