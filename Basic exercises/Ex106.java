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
public class Ex106 {
    public static void main(String[] args)
 {
	int[] array_nums = {11, 15, 13, 10, 45, 20};
    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	
	if(array_nums.length >1)
    {          
    int first = array_nums[0];
              
    for(int i = 1; i < array_nums.length; i++)
        array_nums[i - 1] = array_nums[i];
                        
    array_nums[array_nums.length - 1] = first;
	System.out.println("New Array: "+Arrays.toString(array_nums)); 
	}
  }
}
