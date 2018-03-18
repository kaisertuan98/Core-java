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
public class Ex92 {
    public static void main(String[] args)
 {
    int[] nums = {5, 7, 2, 4, 9};
	int ctr_even = 0, ctr_odd = 0;
	System.out.println("Original Array: "+Arrays.toString(nums)); 
	    
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0)
		{         
          ctr_even++;
		}
		else
		   ctr_odd++;	
    }                 
    System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
	System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
	System.out.printf("\n");	
  }
}
