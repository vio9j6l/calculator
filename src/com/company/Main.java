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
        //int result = var1 + var2;
        return var1 + var2;
    }

    public static void main(String[] args) {
        int var1, var2, result;
        //var1 = 5;
        //var2 = 5;
	    Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Number: ");
        var1 = scnr.nextInt();
        var2 = scnr.nextInt();
        //result = add(var1, var2);
        System.out.println("Addition of two numbers is: " + addition(var1, var2));
    }
}
