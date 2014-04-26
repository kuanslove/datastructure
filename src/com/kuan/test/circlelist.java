package com.kuan.test;

public class circlelist {

	Node head;
	Node cursor;
	int size;

	public circlelist() {
		head = null;
		cursor = head;
		size = 0;
	}

	public void add(int d) {
		if (head == null) {
			cursor = new Node(d);
			head = cursor;
			cursor.next = head;
		} else {
			cursor.next = new Node(d);
			cursor = cursor.next;
			cursor.next = head;
		}

		size++;
	}

	public void begin() {
		Node tmp = cursor;
		for (int n = size(); n > 1; n--) {
			for (int j = 1; j < 3; j++) {
				tmp = tmp.next;
			}
			System.out.println(n + ":" + tmp.next.data);
			tmp.next = tmp.next.next;

		}

		System.out.println("The survivor is :" + tmp.data);

	}

	private class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public int size() {
		return size;
	}

	public void show() {
		Node tmp = head;
		for (int i = 0; i < size(); i++) {
			System.out.print(" " + tmp.data);
			tmp = tmp.next;
		}
		System.out.println();
	}
}
