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
public class Ex86 {
    public static void main(String[] args) {
		int ctr = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
		    System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				ctr += 1;
			}
			else {
				n = (3 * n + 1) / 2;
				ctr += 1;
			}
		}
		System.out.println(ctr);
		in.close();
	}
}
