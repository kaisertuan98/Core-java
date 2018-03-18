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
public class Ex80 {
    public static void main(String[] args)
 {
    int[] array_nums = {20, 30, 40};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0];
	if(array_nums[2] >= max_val)
		max_val = array_nums[2];
	System.out.println("Larger value between first and last element: "+max_val); 	 
 }
}
