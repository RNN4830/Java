/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rnelsonassignment5;

/**
 *
 * @author Rachel Nelson
 *         Assignment 5: While Loop
 *         01/29/2023
 */
public class RNelsonAssignment5 {

    public static void main(String[] args) {

        // declare variables
        double w = 99;
        double x = 1;
        double y = 3;
        double z = 0;

        while (y < 100) {
            System.out.println("Smaller to larger: " + x + "/" + y + " is: " + (x / y));
            z += (x / y);
            y += 2;
        }

        while (w < 100 && w > 1) {
            System.out.println("Larger to smaller: " + x + "/" + (w) + " is: " + (x / (w)));
            z += (x / w);
            w -= 2;
        }
        System.out.println("The sum of all these equations is:" + z);
    }
}
