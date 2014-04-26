package com.kuan.test;

public class maintest {

	public static void main(String[] args) {

		singleNumII sn = new singleNumII();
		sn.singleNumber(new int[] { 1, 1, 1, -4, 2, 2, 2, -3, -3, -3 });

		// iterBST ib = new iterBST();
		// ib.show();

		// numTrees nt = new numTrees();
		// System.out.print(nt.findNumTrees(3));

		// uniqueFinder uf = new uniqueFinder();
		// uf.singleNumber(new int[] { 1, 1, 3, 3, 4, 5, 5, 6, 6, 7, 7 });

		/*
		 * findAncesstor fa = new findAncesstor(); fa.bldTree(); fa.findLCA();
		 */

		// maxPand mp = new maxPand(
		// new char[] { 'g', 'o', 'o', 'l', 'o', 'o', 'e' });
		// mp.maxLen();

		// cc2_4 c = new cc2_4();
		// c.test();

		// cc2_3 c = new cc2_3();
		// c.test();

		// cc2_2 c = new cc2_2();
		// c.test();

		// cc2_1 c = new cc2_1();
		// c.test();

		// int[] a = new int[] { 5, 2, 3, 6,8,1 };
		// quickSort qs = new quickSort(a);
		// qs.sort(0, a.length - 1);
		// qs.show();

		// int[] ia = new int[] { 1,1,1,1 };
		// Permutation p = new Permutation(ia);
		// p.perm(0, ia.length - 1);

		/*
		 * binaryTree bt = new binaryTree(); bt.add(35); bt.add(25); bt.add(15);
		 * bt.add(45); bt.add(55);
		 */

		// circlelist cl = new circlelist();
		// for (int i = 1; i < 42; i++) {
		// cl.add(i);
		// }
		//
		// cl.show();
		// cl.begin();
	}
}

/*
 * 今天没心情写code，总结一下这些题吧。针对第五版。
 * 
 * 很多人都说把这150题做了一遍或几遍，但是我感觉算法题才是重点，其他的很多题面 试基本碰不上，没看出来有必要全做。这里总结一下自己认为重要的题。
 * 
 * 第一章 （8）： 全部重要。1.5 面A碰到， 1.7面Z碰到， 1.8面Bigfish碰到
 * 
 * 第二章 （7）： 全部重要。2.2面Bigfish碰到
 * 
 * 第三章 （2）： 感觉就是3.2, 3.5重要。貌似面M被一小印问到
 * 
 * 第四章（4)： 感觉4.2, 4.3, 4.5，4.6重要。4.5面E碰到
 * 
 * 第九章 （11）： 感觉都重要。F和G很愿意出DP题。这些题没碰到过，但是类似的题碰到过。
 * 
 * 第十章（5）： 10.1 M碰到过两次 10.3 10.4 E碰到 10.6 10.7
 * 
 * 第十七章（3）： 17.8 经典 17.9 S碰到 17.2 G碰到
 * 
 * 第十八章（9）： 18.2 貌似经典 18.5 18.6 面Z碰到类似题 18.7 18.9－18.13
 * 
 * 一共50道题。其他很多题可以做练习，但是面试碰到的概率不大。上边一些题面试也很
 * 难碰到但是是不可不练的题，比如八皇后。另外就是别完全follow书上的答案，注意看 有没有bug。希望大家能补充一下自己认为重要的。
 */

