package com.kuan.test;

public class binaryTree {

	public Node root;

	public binaryTree() {
		root = null;
	}

	public void add(int d) {
		root = add(root, d);
	}

	public void minVal() {
		System.out.println("\n" + min(root).data);
	}

	private Node min(Node n) {
		Node tmp = n;

		if (tmp != null && tmp.ln != null) {
			tmp = tmp.ln;
			tmp = min(tmp);
		}

		return tmp;
	}

	public void remove(int d) {
		Node current = root;
		Node parent = root;
		boolean isLeft = true;

		while (current.data != d) {
			parent = current;

			if (current.data > d) {
				current = current.ln;
				isLeft = true;
			} else {
				current = current.rn;
				isLeft = false;
			}

			if (current == null) {
				return;
			}

			if (current.ln == null && current.rn == null) {
				// 删除0子节点的节点
				if (current == root) {
					root = null;
				} else {
					if (isLeft) {
						parent.ln = null;
					} else {
						parent.rn = null;
					}
				}
			} else {
				// 删除1子节点的节点
				if (current.rn == null) {
					// 只有左节点
					if (current == root) {
						root = current.ln;
					} else {
						if (isLeft) {
							parent.ln = current.ln;
						} else {
							parent.rn = current.ln;
						}
					}
				} else if (current.ln == null) {
					// 只有右节点
					if (current == root) {
						root = current.rn;
					} else {
						if (isLeft) {
							parent.ln = current.rn;
						} else {
							parent.rn = current.rn;
						}
					}
				} else {
					// 两个节点都有
					
				}

			}

		}

	}

	private Node findNode(int d) {
		Node tmp = root;

		while (tmp != null) {
			if (tmp.data == d) {
				break;
			} else {
				if (tmp.data > d) {
					tmp = tmp.ln;
				} else {
					tmp = tmp.rn;
				}
			}
		}

		return tmp;
	}

	public Node add(Node n, int d) {
		if (n == null) {
			n = new Node(d);
		} else {
			if (d > n.data) {
				n.rn = add(n.rn, d);
			} else {
				n.ln = add(n.ln, d);
			}
		}

		return n;
	}

	public void show() {
		show(root);
	}

	private void show(Node n) {

		if (n == null) {
			return;
		} else {
			System.out.print(n.data + " ");
			show(n.ln);
			show(n.rn);
		}
	}

	private class Node {
		Node ln, rn;
		int data;

		public Node(int d) {
			ln = null;
			rn = null;
			data = d;
		}
	}
}
