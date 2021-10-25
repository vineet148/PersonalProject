package com.example.algopractice.Trees;

public class FindTotalNumberOfNodesInCompleteTree {

	public static void main(String args[]) {

		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		int n=findTotalNodes(root);
		System.out.println("Total number of nodes"+n);

	}

	private static int findTotalNodes(TreeNode root) {
		// TODO Auto-generated method stub

		int height = 0;
		if (root == null)
			return 0;

		int leftHeight = HeightOfTree.findHeightofTree(root.getLeft());
		int rightHeight = HeightOfTree.findHeightofTree(root.getRight());

		if (leftHeight == rightHeight) {
			height = (int) (Math.pow(2, leftHeight + 1) - 1);

			return height;
		} else {
			return 1 + findTotalNodes(root.getLeft()) + findTotalNodes(root.getRight());
		}

	}

}
