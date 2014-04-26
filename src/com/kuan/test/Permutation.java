package com.kuan.test;

public class Permutation {

	int[] ia;
	int len;
	int total;

	public Permutation(int[] a) {
		ia = a;
		len = a.length;
		total = 0;
	}

	public void perm(int i, int j) {

		if (i == j) {
			sop();
			return;
		} else {
			for (int n = i; n <= j; n++) {
				if (!isDup(n, j)) {
					swap(n, i);
					perm(i + 1, j);
					swap(n, i);
				}
			}
		}
	}

	public boolean isDup(int i, int j) {
		for (int n = i + 1; n <= j; n++) {
			if (ia[i] == ia[n]) {
				return true;
			}
		}
		return false;
	}

	public void swap(int i, int j) {
		int tmp = ia[i];
		ia[i] = ia[j];
		ia[j] = tmp;
	}

	public void sop() {
		System.out.print("\nTotal [" + ++total + "]:");
		for (int i : ia) {
			System.out.print(" " + i);
		}
	}

}
