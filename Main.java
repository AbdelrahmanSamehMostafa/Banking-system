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
import java.util.Scanner;
import java.util.Random;
public class Main {
    /**
     * User can choose deposit or withdraw money through this system 
     * Clients can create accounts or check their accounts
     * Some function used to displays information about users or accounts
     * @param args that we will use it
     */
    public static void main(String[] args) {
        System.out.println("Welcome to our bank");
        Bank b1 = new Bank("Bank Misr");
        while(true){
        System.out.println("Choose one of the following operations:");
        System.out.println(" 1- Create account \n 2-Check an account \n 3-Show all accounts \n 4-Show all users \n 5-Exit");
        /**
         * condition variable to choose which operation the client wants it
         */
        int condition;
        Scanner scan = new Scanner(System.in);
        condition = scan.nextInt();
        if(condition==1)
        {
            /**
             * balance variable to initialize the balance and taken from the user
             */
            double balance;
            Account a1 = new Account ();
            System.out.println("Enter the initial balance");
            balance = scan.nextDouble();
            a1.setBalance(balance);
            Random random = new Random();
            int accnum=random.nextInt(1000);
            a1.setAccountNumber(accnum);
            System.out.println("The account number is : " + accnum );
            String name,nationalID ,address, phNum;
            System.out.println("Enter the name, the national ID , the address and the phone number of the client respectively:");
           
            scan = new Scanner(System.in);
            name = scan.nextLine();
            nationalID = scan.nextLine();
            address = scan.nextLine();
            phNum = scan.nextLine();
            
            Client c1 = new Client(name,nationalID,address,phNum,a1);
            
           
            b1.add(c1);

        }
        
        else if(condition==2) 
        {
            /**
             * acc variable to store the account number 
             */
            int acc;
            System.out.println("Enter the account number \n");
            acc = scan.nextInt();
            b1.getOneOnly(acc);
          while(true)
          {
              System.out.println("Choose from the following operations:");
              System.out.println(" 1-Deposit \n 2-Withdraw \n 3-Exit");
              /**
               * choose variable to deposit or withdraw or go back to main menu
               */
              int choose;
              scan = new Scanner(System.in);
              choose = scan.nextInt();
              if(choose==1)
              {
                  System.out.println("Enter the deposit value : ");
                  /**
                   * deposit variable to store the amount of money in balance
                   */
                  double deposit;
                  deposit=scan.nextDouble();
                   
                  for(int j=0;j<b1.accountsList.size();j++)
                  {
                      if(b1.accountsList.get(j).getAccountNumber()==acc)
                      {
                          b1.accountsList.get(j).deposit(deposit);
                          System.out.println("Your new balance is : " + b1.accountsList.get(j).getBalance());
                      }
                  }
              }
              if(choose==2)
              {
                  System.out.println("Enter your withdraw value : ");
                  /**
                   * withdraw variable to withdraw the amount of money from balance
                   */
                  double withdraw;
                  withdraw = scan.nextDouble();
                   
                  for(int j=0;j<b1.accountsList.size();j++)
                  {
                      if(b1.accountsList.get(j).getAccountNumber()==acc)
                      {
                          b1.accountsList.get(j).withdraw(withdraw);
                          System.out.println("Your new balance is: " + b1.accountsList.get(j).getBalance());
                      }
                  }
              }
              if(choose==3)
              {
                  break;
              }
              
          }
        }
        /**
         * If chosen condition 3 , It'll displays all the accounts and their balance in the bank
         */
        else if(condition==3)
        {
            b1.getaccount();
        }
        /**
         * If chosen condition 4 , It'll displays all information about the client
         */
        else if(condition==4)
        {
            b1.getclient();
        }
        /**
         * If chosen condition 5 , It'll exits the system
         */
        else if(condition==5)
        {
            break;
        }

    }
    
}
}