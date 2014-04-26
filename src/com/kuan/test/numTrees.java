package com.kuan.test;

public class numTrees {

	public int findNumTrees(int n) {

		int[] total = new int[n + 1];

		total[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				total[i] += total[j - 1] * total[i - j];
			}
		}

		for (int i : total) {
			System.out.print(i + " ");
		}
		return total[n];
	}
}
