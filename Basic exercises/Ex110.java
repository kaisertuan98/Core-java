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
public class Ex110 {
     public static void main(String[] arg) 
	 {
	   int test = 0;
	   Scanner in = new Scanner(System.in);	
	   System.out.print("Input a positive integer: ");
	   int n = in.nextInt(); 
       if (n < 1) {
			 System.out.print(Boolean.toString(false));
			 test = 1;
		}
		if ((n & (n - 1)) != 0) {
			System.out.print(Boolean.toString(false));
			test = 1;
		}
		if (test==0)
		{
			System.out.print(Boolean.toString((n & 0x55555555) != 0));      	
		}
		System.out.print("\n");
	}	
}
