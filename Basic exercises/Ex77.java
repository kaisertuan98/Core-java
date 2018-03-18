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
public class Ex77 {
    public static void main(String[] args)
 {
    int[] array1 = {50, -20, 0};
	int[] array2 = {5, -50, 10};
	System.out.println("Array1: "+Arrays.toString(array1)); 
	System.out.println("Array2: "+Arrays.toString(array2)); 
    int[] array_new = {array1[0], array2[2]};	
	System.out.println("New Array: "+Arrays.toString(array_new)); 	 
 }
}
