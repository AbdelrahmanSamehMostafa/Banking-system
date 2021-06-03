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
public class SpecialAccount extends Account{
   /**
    * It's a constructor for the SpecialAccount class to reuse the private attributes of Account class
    * @param balance Balance in the account
    * @param accountNumber Account number for the account
    */
    SpecialAccount (double balance , double accountNumber){
    super(balance , accountNumber);
    }
    /**
     * Method to withdraw money from the balance of the account
     * It also supports the over drafting for special accounts
     * @param money The amount of money that the client wants to withdraw
     */
    @Override
    public void withdraw (double money){ // override to allow over drafting for special accounts
        if((this.getBalance()< money && (this.getBalance()-money)>=-1000) || (this.getBalance()> money) )
        {
            this.setBalance(this.getBalance()-money);
        }
    } 
}