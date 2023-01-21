/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.year_hundred;

/**
 *
 * @author Rachel Nelson
 */

//import scanner for user input
import java.util.Scanner;
//import year
import java.util.Calendar;

public class Year_hundred {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    

    
    //declare variables
    String name;
    int age;
    int turnHundred;
    
    
    //user input
    System.out.print("Please enter your name: ");
    name = input.nextLine();
    
    System.out.print("Please enter your age: ");
    age = input.nextInt();
    
// have you had a birthday this year? true for yes and false for no
    boolean birthdayYet;
    System.out.print("Have you had your birthday yet this year? True for yes and False for no:");
    birthdayYet = input.nextBoolean();   
    
    if (birthdayYet == true) {
        Calendar cal = Calendar.getInstance();   
        turnHundred = ((cal.get(Calendar.YEAR)) - age) + 100;
    }else{
        Calendar cal = Calendar.getInstance();   
        turnHundred = ((cal.get(Calendar.YEAR)) - age) + 99;
    }

    
            
    System.out.println("Hi, " + name + " ,the year that you will turn 100 is: " + turnHundred);  
   
    }
}
