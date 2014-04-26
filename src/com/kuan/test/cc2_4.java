package com.kuan.test;

public class cc2_4 {
	public void test() {
		linklist ll = new linklist();

		ll.add(5);
		ll.add(4);
		ll.add(1);
		ll.add(2);
		ll.add(6);
		ll.add(3);

		ll.partition(4);

	}

	private class linklist {

		Node root;

		public linklist() {
			root = null;
		}

		public void partition(int x) {
			Node n = root;

			Node smHead = null;
			Node smEnd = null;
			Node lgHead = null;
			Node lgEnd = null;

			while (n != null) {
				if (n.data < x) {
					if (smHead == null) {
						smHead = n;
						smEnd = n;
					} else {
						smEnd.next = n;
						smEnd = smEnd.next;
					}
				} else {
					if (lgHead == null) {
						lgHead = n;
						lgEnd = n;
					} else {
						lgEnd.next = n;
						lgEnd = lgEnd.next;
					}
				}
				n = n.next;
			}
			smEnd.next = lgHead;
			lgEnd.next = null;
			root = smHead;
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
