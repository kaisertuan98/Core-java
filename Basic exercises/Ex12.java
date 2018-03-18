/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07032018;

//Write a Java program that takes three numbers as input to calculate and print the average of the number

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args ){
    Scanner in  = new Scanner(System.in );
    System.out.println("Input first number:");
    int num1 = in.nextInt();
    System.out.println("Input two  number:");
    int num2 = in.nextInt();
    System.out.println("Input three  number:");
    int num3 = in.nextInt();
    System.out.println("Trung bình cộng là:"+ (num1+num2+num3)/3);
    }
    
}
