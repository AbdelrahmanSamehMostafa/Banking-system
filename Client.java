/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework2;

/**
 *
 * @author Abdelrahman Sameh
 */
public class Client {
    
    private String name;
    private String nationalID;
    private String address;
    private String phoneNum;
    private Account account;
    /**
     * It's a constructor for the Client class to set the attributes
     * @param na Name
     * @param natID National ID
     * @param add Address
     * @param phnum Phone Number
     * @param acc1 The account of the client
     */
    public Client(String na,String natID,String add,String phnum,Account acc1)
    {
        name = na;
        nationalID = natID;
        address = add;
        phoneNum = phnum;     
        account = acc1;

    }
    /**
     * It sets the name of the client
     * @param na Name of the clients
     */
    public void setName(String na)
    {
        name = na;
    }
    /**
     * It sets the national ID of the client
     * @param natID National ID of the client
     */
    public void setNationalID(String natID)
    {
        nationalID = natID;
    }
    /**
     * It sets the address of the client
     * @param addr Address of the client
     */
    public void setAddress(String addr)
       {
           address = addr;
       }
    /**
     * It sets the phone number of the client
     * @param phnum Phone Number of the client
     */
    public void setPhoneNum(String phnum)
    {
        phoneNum = phnum;
    }
    /**
     * It sets the account of the client
     * @param acc1 Account of the client
     */
    public void setAccount(Account acc1)
    {
        account = acc1;
    }
    /**
     * It returns the name of the client
     * @return it returns the name of the client
     */
    public String getName()
    {
        return name;
    }
    /**
     * It returns the national ID of the client
     * @return It returns the national ID of the client
     */
    public String getNationalID()
    {
        return nationalID;
    }
    /**
     * It returns the address of the client
     * @return It returns the address of the client
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * It returns the phone number of the client
     * @return It returns the phone number of the client
     */
    public String getPhoneNum()
    {
        return phoneNum;
    }
    /**
     * It returns the account of the client
     * @return It returns the account of the client
     */
    public Account getAccount()
    {
        return account;
    }
    /**
     * Overriding the parent check ID
     * @return It return the information of the Client
     */
    @Override
    public String toString()
    {
        return "Client's name: " + name + "\n Client's national ID: " + nationalID + "\n Client's address: " + address + "\n Client's phone number: " + phoneNum + "\n Client's bank account: " + account.toString()+ "\n" ;
    }
}