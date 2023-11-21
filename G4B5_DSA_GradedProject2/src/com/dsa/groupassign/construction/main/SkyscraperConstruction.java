package com.dsa.groupassign.construction.main;

import com.dsa.groupassign.construction.services.PrintContructionOrder;
import java.util.Scanner;

public class SkyscraperConstruction {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number floors in the building : ");
		int n = sc.nextInt();

		int[] day = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int size = sc.nextInt();
			day[size] = i;
		}

		PrintContructionOrder.printOrder(day, n);
		sc.close();
	}
}
