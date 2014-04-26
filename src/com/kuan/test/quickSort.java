package com.kuan.test;

public class quickSort {

	int[] a;

	public quickSort(int[] a) {
		this.a = a;
	}

	public void sort(int l, int r) {
		if (l < r) {
			int p = partition(l, r);
			sort(l, p - 1);
			sort(p + 1, r);
		}
	}

	public int partition(int l, int r) {
		int p = l;

		int pivot = a[r];

		for (int i = l; i < r; i++) {
			if (a[i] <= pivot) {
				swap(p, i);
				p++;
			}
		}
		swap(p, r);

		return p;

	}

	public void show() {
		for (int i : a) {
			System.out.print(i + "");
		}
	}

	public void swap(int i, int j) {

		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
