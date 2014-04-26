package com.kuan.test;

public class linklist {

	Node head, cursor;
	int size;

	public linklist() {
		head = null;
		cursor = head;
		size = 0;
	}

	public void add(int d) {
		if (head == null) {
			head = new Node(d);
			cursor = head;
		} else {
			cursor.next = new Node(d);
			cursor = cursor.next;
		}
		size++;
	}

	public void insert(int d, int index) {
		if (index < 0 || index > this.size()) {
			System.out.println("Can not insert, out of bound");
		} else {
			Node tmp = head;
			Node tn = new Node(d);
			if (index == 0) {
				tn.next = head;
				head = tn;
			} else {
				while (index > 1) {
					tmp = tmp.next;
					index--;
				}
				tn.next = tmp.next;
				tmp.next = tn;
			}
		}
		size++;
	}

	public void delete(int index) {
		if (index < size()) {
			System.out.println("Out bound");
		} else {
			Node tmp = head;
			if (size() == 1) {
				head = null;
				tmp = null;
			} else {
				while (index > 0) {

					index--;
				}
				tmp.next = tmp.next.next;
			}
			size--;
		}
	}

	public int size() {
		return size;
	}

	private class Node {
		Node next;
		int data;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public void show() {

		Node tmp = head;
		while (tmp != null) {
			System.out.print(" " + tmp.data);
			tmp = tmp.next;
		}
	}

}
