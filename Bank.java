/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework2;

/**
 * @author Abdelrahman Sameh
 */
import java.util.ArrayList;

public class Bank {
     
    private String name_;
    private String address_;
    private double phoneNum_;
    /**
     * It's a constructor for the Bank class to set the attributes ( Address , Phone Number)
     * @param na Name
     */
    public Bank(String na)
    {
        name_ = na;
        address_ = " ";
        phoneNum_ = 0.0;
    }
    /**
     * it sets the name of the bank
     * @param Name Name of the bank
     */
    public void setName(String Name)
    {
        name_ = Name;
    }
    /**
     * it sets the address of the bank
     * @param Address address of the bank
     */
    public void setAddress(String Address)
    {
        address_ = Address;
    }
    /**
     * it sets the phone of the bank
     * @param Phone Phone of the bank
     */
    public void setPhone(double Phone)
    {
        phoneNum_ = Phone;
    }
    /**
     * @return it return the name of the bank
     */
    public String getName()
    {
        return name_;
    }
    /**
     * @return it returns the address of the bank
     */
    public String getAddress()
    {
        return address_;
    }
    /**
     * @return it returns the phone of the bank
     */
    public double getPhone()
    {
        return phoneNum_;
    }
    
    ArrayList <Account> accountsList = new ArrayList <Account>();
    ArrayList <Client> clientsList = new ArrayList <Client>();

    /**
     * It's a method to add a new client and his account
     * @param currentClient Current client
     */
    public void add( Client currentClient)
    {
        clientsList.add(currentClient);
        accountsList.add(currentClient.getAccount());
    }
    /**
     * It's a method to display existing clients and their accounts
     */
    public void getAll()
    {
        System.out.println(clientsList);
        System.out.println(accountsList);
    }
    /**
     * It checks only one account using the account number
     * @param currentAccount 
     */
    public void getOneOnly(int currentAccount)
    {
        for(int i=0;i<accountsList.size();i++){
        if (accountsList.get(i).getAccountNumber() == currentAccount)
        {
            System.out.println(clientsList.get(i));
            
        }     
    }
    }
    /**
     * It displays all the accounts in the bank
     */
    public void getaccount()
    {
        System.out.println(accountsList);
    }
    /**
     * It displays all the information of the client in the bank
     */
    public void getclient()
    {
        System.out.println(clientsList);
    }
}

