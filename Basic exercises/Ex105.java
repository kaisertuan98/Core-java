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
public class Ex105 {
    public static void main(String[] args)
 {
	int[] array_nums = {11, 15, 13, 10, 45, 20, 11, 15};
    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	
	int result = 0;
	int l = 2;
    int start = 0;
	int end = array_nums.length-l;
	for(; l > 0; l--)
	{
		if(array_nums[start] != array_nums[end])
			result = 1;
		else
		{
			start++;
			end++;
		}
	}
	                
    if (result==1)
	 {
	  System.out.printf(String.valueOf(false));
	 }
	else
	 {
	   System.out.printf(String.valueOf(true));
	 }
	 System.out.printf("\n");	
  }
}
