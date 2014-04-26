package com.kuan.test;

public class maxPand {

	char[] ca;

	public maxPand(char[] ca) {
		this.ca = ca;
	}

	public void maxLen() {

		int maxl = 1;
		int i = 0;
		while (i < ca.length) {

			// even situation
			int p = i;
			int q = i + 1;
			while (p >= 0 && q <= (ca.length - 1) && ca[p] == ca[q]) {
				p--;
				q++;
			}
			if ((q - p - 1) > maxl) {
				maxl = q - p - 1;
			}

			// odd situation
			p = i - 1;
			q = i + 1;
			while (p >= 0 && q <= (ca.length - 1) && ca[p] == ca[q]) {
				p--;
				q++;
			}
			if ((q - p - 1) > maxl) {
				maxl = q - p - 1;
			}
			i++;
		}

		System.out.print(maxl);

	}
}
