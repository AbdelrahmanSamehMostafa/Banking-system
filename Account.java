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
public class Account {
    private double balance_ , accountNumber_;
    /**
     * It's a constructor for the Account class to initialize attributes
     * @param balance Balance in the account
     * @param accountNumber Account number for the account
     */
    Account (){
        balance_ = 0.0;
        accountNumber_ = 0.0;
    }
    Account (double balance , double accnum){
        balance_ = balance;
        accountNumber_ = accnum;
    }
    /**
     * it sets the balance value
     * @param balance Balance in the account
     */
    public void setBalance (double balance){
        balance_ = balance;
    }
    /**
     * It's a method to return the amount of money (Balance) 
     * @return The balance in the account
     */
    public double getBalance (){
        return balance_;
    }
    /**
     * it sets the account number
     * @param accNum Account number for the account
     */
    public void setAccountNumber (double accNum){
        accountNumber_ = accNum;
    }
    /**
     * It's a method to return the account number 
     * @return The account number for the account
     */
    public double getAccountNumber (){
        return accountNumber_;
    }
    /**
     * It's a method to return the information of the Account 
     * @return it return the information of the Account
     */
    @Override
    public String toString(){
        return "Balance = " + balance_ + "\n Account number = " + accountNumber_;
    }
    /**
     * Method to deposit money in the balance of the account
     * @param money The amount of money that the client wants to deposit
     */
    public void deposit(double money){
        balance_ = balance_ + money;
        System.out.println("Your new balance : " + balance_);
    }
    /**
     * Method to withdraw money from the balance of the account
     * @param money The amount of money that the client wants to withdraw
     */
    public void withdraw (double money){
        if (money < balance_){
            balance_ = balance_- money;
            System.out.println("Your new balance : " + balance_);
        }
        else if (money > balance_){
            System.out.println("Sorry, You don't have enough balance");
            System.out.println("Your balance is " + balance_);
        }
        else { System.out.println("Error!");
    }
}
}
