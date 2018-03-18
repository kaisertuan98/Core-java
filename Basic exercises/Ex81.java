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
public class Ex81 {
    public static void main(String[] args)
 {
    int[] array_nums = {20, 30, 40};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int x = array_nums[0];
	array_nums[0] = array_nums[array_nums.length-1];
	array_nums[array_nums.length-1] = x;
	System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums));  
 }
}
