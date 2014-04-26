package com.kuan.test;

public class ccc2_6 {

	private class loopLList {
		Node root;

		public loopLList() {
			root = null;
		}

		public void add(int d) {
			if (root == null) {
				root = new Node(d);
			} else {
				Node tmp = root;
				while (tmp.next != null) {
					tmp = tmp.next;
				}
				tmp.next = new Node(d);
			}
		}

		public void add(int d, Node n) {
			if (root == null) {
				root = new Node(d);
			} else {
				Node tmp = root;
				while (tmp.next != null) {
					tmp = tmp.next;
				}
				tmp.next = new Node(d);
				tmp = tmp.next;
				tmp.next = n;
			}
		}

		public void show() {
			Node tmp = root;
			while (tmp != null) {
				System.out.print(tmp.data + " ");
				tmp = tmp.next;
			}
		}

	}

	private class Node {
		Node next;
		int data;

		public Node(int d) {
			data = d;
			next = null;
		}
	}
}
