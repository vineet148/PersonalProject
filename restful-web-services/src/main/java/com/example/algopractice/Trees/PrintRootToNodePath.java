package com.example.algopractice.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintRootToNodePath {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		TreeNode keyNode = new TreeNode(7);
		List<TreeNode> path = new ArrayList<TreeNode>();
		printRootToNode(root, 7, path);
		printpath(path);
	}

	private static boolean printRootToNode(TreeNode root, int key, List<TreeNode> path) {
		// TODO Auto-generated method stub

		if (root == null) {
			return false;
		}

		path.add(root);

		if (root.getData() == key) {
			return true;
		}

		boolean left = printRootToNode(root.getLeft(), key, path);
		boolean right = printRootToNode(root.getRight(), key, path);

		if (left || right) {
			return true;
		}
		path.remove(path.size() - 1);
		return false;
	}

	private static void printpath(List<TreeNode> path) {
		// TODO Auto-generated method stub

		for (TreeNode t : path) {
			System.out.println(t.getData());
		}
	}
}
