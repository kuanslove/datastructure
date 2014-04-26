package com.kuan.test;

import java.util.ArrayList;
import java.util.Stack;

public class iterBST {

	TreeNode root, n11, n22;

	public void bldTree() {
		root = new TreeNode(1);
		n11 = new TreeNode(2);
		n22 = new TreeNode(3);

		root.right = n11;
		n11.left = n22;
	}

	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> ol = new ArrayList<Integer>();
		Stack<TreeNode> ts = new Stack<TreeNode>();

		
		TreeNode tmp = root;

		while (tmp != null || !ts.isEmpty()) {
			if (tmp != null) {
				ts.push(tmp);
				tmp = tmp.left;
			} else {
				tmp = ts.pop();
				ol.add(tmp.val);
				tmp = tmp.right;
			}
		}

		return ol;
	}

	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> ol = new ArrayList<Integer>();
		Stack<TreeNode> ts = new Stack<TreeNode>();

		TreeNode tmp = root;
		if (tmp != null) {
			ts.push(tmp);
		}

		while (!ts.isEmpty()) {
			tmp = ts.pop();
			ol.add(tmp.val);
			if (tmp.right != null) {
				ts.add(tmp.right);
			}
			if (tmp.left != null) {
				ts.add(tmp.left);
			}
		}

		return ol;
	}

	public void show() {
		bldTree();
		for (Integer i : inorderTraversal(root)) {
			System.out.print(i + " ");
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}
}
