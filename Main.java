package com.turkcellCamp;

public class Main {

    public static void main(String[] args) {
        CustomerControlService customerControlService =new EdevletValidatorAdaptor();
        Customer customer = new Customer("Emrah", "Yılmaz", "4446576886",1995);
        System.out.println(customerControlService.isValid(customer));

    }
}
