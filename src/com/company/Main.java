/*
Project: JavaDocs and Unit Tests for the Calculator Lab
Feature:
Course: IST 242
Author: JiaJia Liu
Date Developed: 4/16/2019
Last Date Changed:
Rev:
*/

package com.company;
import java.util.Scanner;

public class Main {

    /**
     *
     * @param           var1
     * @param           var2
     * @return          int
     * @author          JiaJia Liu
     * @version         1.0
     * @since           2019-04-16
     *
     */

    public static int addition(int var1, int var2) {
        return var1 + var2;
    }

    public static int subtraction(int var1, int var2) {
        return var1 - var2;
    }

    public static int multiplication(int var1, int var2) {
        return var1 * var2;
    }

    public static int division(int var1, int var2) {
        return var1 / var2;
    }

    public static void main(String[] args) {
        int var1, var2;

	    Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        var1 = scnr.nextInt();
        var2 = scnr.nextInt();
        System.out.println("Addition of two numbers is: " + addition(var1, var2));
        System.out.println("Subtraction of two numbers is: " + subtraction(var1, var2));
        System.out.println("Multiplication of two numbers is: " + multiplication(var1, var2));
        System.out.println("Division of two numbers is: " + division(var1, var2));

    }
}
