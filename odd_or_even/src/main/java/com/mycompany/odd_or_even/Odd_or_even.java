/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odd_or_even;

/**
 *
 * @author Rachel Nelson
 */
//Import Java utility Scanner
import java.util.Scanner;
public class Odd_or_even {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int userNumber;
    
    System.out.print("Please pick a number to determine if it is even or odd: ");
    userNumber = input.nextInt();  
    
        if (userNumber % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    
    }
}
