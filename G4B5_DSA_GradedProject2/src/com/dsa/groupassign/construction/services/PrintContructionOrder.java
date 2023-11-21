package com.dsa.groupassign.construction.services;

import java.util.Stack;

public class PrintContructionOrder {

	public static void printOrder(int[] day, int n) {
		Stack<Integer> mainStack = new Stack<>();
		Stack<Integer> tempStack = new Stack<>();
		int temp = n;

		System.out.println("The order of construction is as follows ");

		for (int i = 1; i <= n; i++) {
			System.out.println("Day " + i + " :");

			while (temp >= 1 && day[temp] <= i) {
				mainStack.push(temp);
				temp--;
			}

			while (!mainStack.isEmpty()) {
				tempStack.push(mainStack.pop());
			}

			while (!tempStack.isEmpty()) {
				System.out.print(tempStack.pop() + " ");
			}
			System.out.println();
		}
	}
}
