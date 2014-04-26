package com.kuan.test;

//Given an array of integers, every element appears twice except for one. Find that single one.
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class uniqueFinder {
	public int singleNumber(int[] A) {
		int sn = A[0];
		for (int i = 1; i < A.length; i++) {
			sn ^= A[i];
		}
		System.out.print(sn);
		return sn;
	}

	public void show() {

	}
}
