/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07032018;

//Write a Java program to print the area and perimeter of a rectangle
public class Ex13 {
    public static void main(String[] string ){
    final double rong = 5.6;
    final double dai = 8.5;
    double chuvi = 2*(dai+rong );
    
    double dientich = dai*rong;
    
    System.out.printf ("Chu vi la 2*(%.1f+%.1f)=%.2f\n", dai,rong,chuvi);
    System.out.printf("Diện tích là (%.1f*%1f)=%2f\n", dai,rong,dientich);
    }
    
}
