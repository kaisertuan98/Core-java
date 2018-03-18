/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07032018;

/**
 *
 * @author appTuan
 */
public class Ex73 {
     public static void main(String[] args)
 {
    String str1 = "Python"; 
	String str2 = ""; 
	
	int length2 = str2.length();
	String result = "";
	result += (str1.length() >= 1) ? str1.charAt(0) : '#';
	result += (length2 >= 1) ? str2.charAt(length2-1) : '#';
	System.out.println(result);
 }
}
