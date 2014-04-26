package com.kuan.test;

public class cc2_3 {

	public void test() {
		linklist ll = new linklist();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);

		ll.deleteMidnode(1);
	}

	private class linklist {

		Node root;

		public linklist() {
			root = null;
		}

		public void deleteMidnode(int d) {
			Node n = root;
			while (d > 0) {
				n = n.next;
				d--;
			}

			Node nxt = n.next;
			n.data = nxt.data;
			n.next = nxt.next;

			show();
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
