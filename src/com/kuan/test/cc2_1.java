package com.kuan.test;

import java.util.Hashtable;

public class cc2_1 {

	public void test() {
		linklist ll = new linklist();

		ll.add(1);
		ll.add(1);
		ll.add(3);
		ll.add(2);
		ll.add(2);
		ll.add(1);
		ll.rmDup();
		ll.show();
	}

	private class linklist {

		Node root;

		public void rmDup() {
			Hashtable<Integer, Boolean> table = new Hashtable<>();
			Node prev = null;
			Node n = root;

			while (n != null) {
				if (table.containsKey(n.data)) {
					prev.next = n.next;
				} else {
					table.put(n.data, true);
					prev = n;
				}
				n = n.next;
			}
		}

		public linklist() {
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
