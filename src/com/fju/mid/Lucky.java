package com.fju.mid;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		Random r = new Random();
		System.out.print(r.nextInt(10)+1+" ");
		System.out.print(r.nextInt(10)+1+" ");
		System.out.print(r.nextInt(10)+1+" ");
		System.out.print(r.nextInt(10)+1+" ");
		System.out.print(r.nextInt(10)+1+" ");
		System.out.print(r.nextInt(10)+1+" ");
		

	}
}

/*
 * /System.out.print(ran.nextInt(10)+1+" ");
 * System.out.print(ran.nextInt(10)+1+" ");
 * System.out.print(ran.nextInt(10)+1+" ");
 * System.out.print(ran.nextInt(10)+1+" ");
 * System.out.print(ran.nextInt(10)+1+" ");
 * System.out.println(ran.nextInt(10)+1);
 * 
 * 
 * if (n == ran){ System.out.print("Yes"); }else{ System.out.print("no"); }/
 */