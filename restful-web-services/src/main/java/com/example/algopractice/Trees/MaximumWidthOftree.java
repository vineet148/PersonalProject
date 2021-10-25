package com.example.algopractice.Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode3 {

	int index;
	int data;
	TreeNode3 left;
	TreeNode3 right;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public TreeNode3(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode3 getLeft() {
		return left;
	}

	public void setLeft(TreeNode3 left) {
		this.left = left;
	}

	public TreeNode3 getRight() {
		return right;
	}

	public void setRight(TreeNode3 right) {
		this.right = right;
	}
}

class Tree3 {

	public TreeNode3 createTree() {
		TreeNode3 root = new TreeNode3(1);
		TreeNode3 t2 = new TreeNode3(2);
		TreeNode3 t3 = new TreeNode3(3);
		TreeNode3 t4 = new TreeNode3(4);
		TreeNode3 t5 = new TreeNode3(11);
		TreeNode3 t6 = new TreeNode3(6);
		TreeNode3 t7 = new TreeNode3(7);
		TreeNode3 t8 = new TreeNode3(8);
		TreeNode3 t9 = new TreeNode3(9);
		root.setLeft(t2);
		root.setRight(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		t3.setLeft(t6);
		t3.setRight(t7);
		t4.setLeft(t8);
		t8.setLeft(t9);
		return root;
	}

	public int findHeightofTree(TreeNode3 root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return 0;
		}

		int left = findHeightofTree(root.getLeft());
		int right = findHeightofTree(root.getRight());

		if (left >= right) {
			return left + 1;
		} else {
			return right + 1;
		}

		// return 1+max(left, right);

	}

	public static int max(int left, int right) {
		// TODO Auto-generated method stub
		if (left > right) {
			return left;
		} else {
			return right;
		}
	}

}

public class MaximumWidthOftree {

	public static void main(String args[]) {

		Tree3 tree1 = new Tree3();
		TreeNode3 root = tree1.createTree();
		int h = tree1.findHeightofTree(root);
		System.out.println("height" + h);
		root.setIndex(0);
		Queue<TreeNode3> queue = new LinkedList<TreeNode3>();
		queue.add(root);
		findMaximumWidth(root, queue, h);

	}

	private static void findMaximumWidth(TreeNode3 root, Queue<TreeNode3> queue, int height) {
		// TODO Auto-generated method stub
		int min = 0;
		int ans = 0;
		int first = 0, last = 0;
		while (!queue.isEmpty()) {
			min = queue.peek().getIndex();
	
			for (int i = 0; i < queue.size(); i++) {

				if (i == 0) {
					first = queue.peek().getIndex();

				}
				if (i == queue.size() - 1) {
					last = queue.peek().getIndex();
				}

				TreeNode3 node = queue.poll();
				if (node.getLeft() != null) {
					TreeNode3 temp = node.getLeft();
					temp.setIndex((2 * (node.getIndex()) + 1 - min));
					queue.add(temp);
				}

				if (node.getRight() != null) {
					TreeNode3 temp = node.getRight();
					temp.setIndex((2 * (node.getIndex()) + 2) - min);
					queue.add(temp);
				}

			}

			ans=Math.max(ans, (last - first + 1));

		}

		System.out.println("max width of tree is" + ans);
		LevelOrderTraversal.printLevelOrder(root);

	}

}
