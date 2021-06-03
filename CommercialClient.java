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
public class CommercialClient extends Client {
    private String commercialID_;
    /**
     * It's a constructor for the CommercialClient class
     * @param na Name
     * @param nID National ID
     * @param add Address
     * @param phnum Phone Number
     * @param acc The account of the client
     */
    public CommercialClient(String na,String nID,String add,String phnum,Account acc)
    {
        super(na, nID, add, phnum, acc);
        this.setNationalID("00000000000000");
        commercialID_ = " ";
    }
    /**
     * it sets the commercial ID of the client
     * @param cID Commercial ID
     */
    public void setCommercialID(String cID)
    {
        commercialID_ = cID;
    }
    /**
     * @return it returns the commercial ID of the client
     */
    public String getCommercialID()
    {
        return commercialID_;
    }
   /**
    * Overriding the parent check ID
    * @return it return the information of the CommercialClient
    */
    @Override
    public String toString()
    {
        return "Client's name: " + this.getName() + "\n Client's commercial ID: " + commercialID_ + "\n Client's address: " + this.getAddress() + "\n Client's phone number: " + this.getPhoneNum() + "\n Client's bank account: " + this.getAccount().toString()+ "/n" ;
    }
}