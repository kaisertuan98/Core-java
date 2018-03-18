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
public class Ex68 {
    public static void main(String[] args)
 {
   String main_string = "Python 3.0";
      
   String last_three_chars = main_string.substring(main_string.length() - 3);
   System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
  }
}
