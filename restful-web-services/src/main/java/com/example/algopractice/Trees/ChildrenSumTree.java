package com.example.algopractice.Trees;

public class ChildrenSumTree {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		TreeNode t = root;
		ChildrenSumTree(root);
		LevelOrderTraversal.printLevelOrder(t);

	}

	private static void ChildrenSumTree(TreeNode root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}
		int sum = 0;
		if (root.getLeft() != null) {
			sum += root.getLeft().getData();
			System.out.println("root" + root.getData() + "left sum" + sum);
		}
		if (root.getRight() != null) {
			sum += root.getRight().getData();
			System.out.println("root" + root.getData() + "right sum" + sum);
		}

		if (root.getLeft() != null && sum < root.getData()) {
			root.getLeft().setData(sum);
		}

		if (root.getRight() != null && sum < root.getData()) {
			root.getRight().setData(sum);
		}

		if (root != null && sum >= root.getData()) {
			root.setData(sum);
		}

		ChildrenSumTree(root.getLeft());
		ChildrenSumTree(root.getRight());

		//When it is traversing upward that is backtracking
		int temp = 0;
		if (root.getLeft() != null) {
			temp += root.getLeft().getData();
		}
		if (root.getRight() != null) {
			temp += root.getRight().getData();
		}

		if (root.getLeft() != null || root.getRight() != null)
			root.setData(temp);

	}

}
