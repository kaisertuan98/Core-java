/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07032018;
import java.util.Scanner;
/**
 *
 * @author appTuan
 */
public class Ex06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    System.out.println("Input first number: ");
    int num1 = in.nextInt();
    System.out.println("Input second number:");
    int num2 = in.nextInt();
     System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
      System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
       System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
    
}
