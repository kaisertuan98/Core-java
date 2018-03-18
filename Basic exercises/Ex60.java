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
public class Ex60 {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 String[] words = line.split("[ ]+");
	 System.out.println("Penultimate word: "+words[words.length - 2]);
	 }		
}
