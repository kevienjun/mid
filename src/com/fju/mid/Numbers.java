package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i = 1; i <= n; i++) {
			System.out.println(i);

		}

	}
}