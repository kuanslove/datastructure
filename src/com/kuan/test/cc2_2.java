package com.kuan.test;

public class cc2_2 {

	public void test() {
		linklist ll = new linklist();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);

		ll.nth2Last(4);

	}

	private class linklist {

		Node root;

		public linklist() {
			root = null;
		}

		public void nth2Last(int n) {

			Node fast = root;
			Node slow = root;

			for (int i = n; i > 0; i--) {
				fast = fast.next;
				if (fast == null) {
					System.out.print("长度不够");
				}
			}

			while (fast != null) {
				fast = fast.next;
				slow = slow.next;
			}

			System.out.print("倒数第" + n + "个：" + slow.data);
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
