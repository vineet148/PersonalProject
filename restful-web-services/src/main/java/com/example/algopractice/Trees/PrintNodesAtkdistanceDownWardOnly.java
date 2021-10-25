package com.example.algopractice.Trees;

import java.util.ArrayList;
import java.util.List;

public class PrintNodesAtkdistanceDownWardOnly {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		int key = 4;
		int k = 1;

		findNodesAtKDis(root, key, k);

	}

	public static void findNodesAtKDis(TreeNode root, int key, int k) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		List<TreeNode> res = new ArrayList<>();
		if (root.getData() == key) {
			int count = 0;
			findNodes(root, k, res, count);

			for (TreeNode t : res) {
				System.out.println(t.getData());
			}
			
			return;

		} else {

			findNodesAtKDis(root.getLeft(), key, k);
			findNodesAtKDis(root.getRight(), key, k);
		}

	}

	private static void findNodes(TreeNode root, int k, List<TreeNode> res, int count) {
		// TODO Auto-generated method stub

		if (root == null)
			return;

		if (count == k) {
			res.add(root);
		}
		count++;
		findNodes(root.getLeft(), k, res, count);
		findNodes(root.getRight(), k, res, count);

		count--;
	
	
	}

}
