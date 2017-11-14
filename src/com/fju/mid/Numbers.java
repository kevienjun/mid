package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n <= 10) {
			for (int i = 1; i <= n; i++) {

				System.out.print(i + " ");

				if ((i % 5) == 0) {
					System.out.print("#" + " ");

				}

			}
		}if (n > 10){
			for (int i = 1; i <= 10; i++) {

				System.out.print(i + " ");

				if ((i % 5) == 0) {
					System.out.print("#" + " ");

				}
			
		}
	}

	}
}
