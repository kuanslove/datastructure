package com.kuan.test;

public class singleNumII {

	public int singleNumber(int[] A) {

		int[] ba = new int[32];
		for (int i = 0; i < 32; i++) {
			ba[i] = 0;
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < 32; j++) {
				ba[j] += (A[i] >> j) & 1;
				// A[i] /= 2;
			}
		}

		for (int i = 0; i < 32; i++) {
			ba[i] %= 3;
		}

		int single = 0;

		for (int i = 31; i >= 0; i--) {
			single = single * 2 + ba[i];
		}

		System.out.print(single);
		return single;

	}
}
