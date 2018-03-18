/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07032018;

import java.util.Arrays;

/**
 *
 * @author appTuan
 */
public class Ex95 {
    public static void main(String[] args)
 {
    int n= 5;
	String[] arr_string = new String[n];
	
    for(int i = 0; i < n; i++)
        arr_string[i] = String.valueOf(i);                                  
	 System.out.println("New Array: "+Arrays.toString(arr_string)); 
	 }
}
