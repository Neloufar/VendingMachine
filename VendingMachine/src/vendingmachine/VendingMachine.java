/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author nl2027
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner kbd = new Scanner(System.in);
        int leave = 1;
        while (leave!= 0)
        {
            
        
        System.out.println("Items:");
        System.out.println("1. Snickers ");
        System.out.println("2. Milky Way ");
        System.out.println("3. Twix");
        System.out.println("4. M&M");
        System.out.println("5. Hersheys");
        System.out.println("Your Selection - ");
        
        String yourchoice = kbd.next();
        
        int amount = 0;
        
       System.out.println("You chose: " + yourchoice);
       
       System.out.println("Insert your money :");
       
       double dollar = 1.00;
       double fiveDollar = 5.00;
       double quarter = .25;
       double dime = .10;
       double nickle = .05;
       double penny = .01;
       
       
       
       amount = kbd.nextInt();
       
       double balance;
       
       balance = amount;
       
       double TotalBalance = balance + amount;
       System.out.println("if you would like to leave press 0");
       leave= kbd.nextInt();
        }
        
        
    }
               
    
                  
    
    
}
