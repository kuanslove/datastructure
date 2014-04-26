package com.kuan.test;

public class findAncesstor {

	Node root;
	Node n23, n21;

	public findAncesstor() {
		root = null;
	}

	public void bldTree() {
		root = new Node();
		Node n00 = new Node(1);
		Node n01 = new Node(3);
		root.ln = n00;
		root.rn = n01;

		Node n10 = new Node(5);
		Node n11 = new Node(7);
		Node n12 = new Node(9);
		Node n13 = new Node(2);
		n00.ln = n10;
		n00.rn = n11;
		n01.ln = n12;
		n01.rn = n13;

		Node n20 = new Node(4);
		n21 = new Node(6);
		Node n22 = new Node(8);
		n23 = new Node(10);
		Node n24 = new Node(11);
		Node n25 = new Node(13);
		Node n26 = new Node(15);
		Node n27 = new Node(17);
		n10.ln = n20;
		n10.rn = n21;
		n11.ln = n22;
		n11.rn = n23;
		n12.ln = n24;
		n12.rn = n25;
		n13.ln = n26;
		n13.rn = n27;

		show(root);

	}

	public void findLCA() {
		System.out.print("\n" + find(root, n23, n21).d);
	}

	public Node find(Node root, Node a, Node b) {
		if (root == null) {
			return null;
		}
		if (root == a || root == b) {
			return root;
		}

		Node l = find(root.ln, a, b);
		Node r = find(root.rn, a, b);
		if (l != null && r != null) {
			return root;
		}

		return l != null ? l : r;

	}

	private class Node {
		Node ln, rn;
		int d;

		public Node() {
			this.d = 0;
			ln = null;
			rn = null;
		}

		public Node(int d) {
			this.d = d;
			ln = null;
			rn = null;
		}
	}

	private void show(Node n) {
		if (n == null) {
			return;
		}
		System.out.print(n.d + " ");
		show(n.ln);
		show(n.rn);
	}

}
