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
public class Ex78 {
     public static void main(String[] args)
 {
    int[] array_nums = {5, 7};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	if(array_nums[0] == 4 || array_nums[0] == 7)
		System.out.println("True");
	else
    System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
	 
 }
}
