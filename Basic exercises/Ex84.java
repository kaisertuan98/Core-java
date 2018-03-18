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
import java.util.*; 
import java.io.*; 
public class Ex84 {
    public static void main(String[] args)
 {
   String string1 = "Python";
    int slength = 3;
    if (slength > string1.length()) {
      slength = string1.length();
    }

    String subpart = string1.substring(string1.length()-3);
    System.out.println(subpart + string1 + subpart);
  }
}
