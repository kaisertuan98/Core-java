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
public class Ex15 {
    public static void main(String[] args){
    int a,b,temp;
    a = 15;
    b = 12;
    System.out.println ("Trước khi đổi : a,b="+a+","+ +b );
    temp = a;
    a=b;
    b= temp;
    System.out.println ("Sau khi đổi:a,b="+a+","+ +b );
    }
}
