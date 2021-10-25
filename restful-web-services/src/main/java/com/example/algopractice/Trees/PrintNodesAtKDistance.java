package com.example.algopractice.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;
import org.javatuples.Pair;

public class PrintNodesAtKDistance {

	public static void main(String args[]) {

		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		int key = 4;
		int k = 1;
		HashMap<TreeNode, TreeNode> parentchildMap = findParent(root);

		findNodesAtKDis(root, key, k, parentchildMap);

	}

	private static void findNodesAtKDis(TreeNode root, int key, int k, HashMap<TreeNode, TreeNode> parentchildMap) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		List<TreeNode> res = new ArrayList<>();
		if (root.getData() == key) {
			int count = 0;
			findNodes(root, k, res, count, parentchildMap);

			for (TreeNode t : res) {
				System.out.println(t.getData());
			}

			return;

		} else {

			findNodesAtKDis(root.getLeft(), key, k, parentchildMap);
			findNodesAtKDis(root.getRight(), key, k, parentchildMap);
		}

	}

	private static void findNodes(TreeNode root, int k, List<TreeNode> res, int count,
			HashMap<TreeNode, TreeNode> parentchildMap) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		int c = 0;
		HashMap<TreeNode, Integer> visited = new HashMap<>();
		Queue<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
		Pair<TreeNode, Integer> p = Pair.with(root, 0);
		queue.add(p);
		List<TreeNode> list = new ArrayList<>();
		while (!queue.isEmpty()) {

			Pair p1 = queue.poll();
			TreeNode node = (TreeNode) p1.getValue(0);
			int c1 = (int) p1.getValue(1);
			visited.put(node, 1);

			if (c1 == k) {
				list.add(node);
			}

			int c2 = c1 + 1;
			if (parentchildMap.containsKey(node)) {
				TreeNode parent = parentchildMap.get(node);
				if (visited.get(parent) == 0)
					queue.add(new Pair(parent, c2));
			}
			
			if (node.getLeft() != null && visited.get(node.getLeft()) == 0) {
				queue.add(new Pair(node.getLeft(), c2));

			}
			if (node.getRight() != null && visited.get(node.getRight()) == 0) {
				queue.add(new Pair(node.getRight(), c2));

			}

		}
		System.out.println("result is");

		for (TreeNode n : list) {
			System.out.println(n.getData());
		}

	}

	private static HashMap<TreeNode, TreeNode> findParent(TreeNode root) {
		// TODO Auto-generated method stub

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		Vector<Integer> v = new Vector<>();

		HashMap<TreeNode, TreeNode> parentChildMap = new HashMap<>();
		parentChildMap.put(root, null);
		while (!queue.isEmpty()) {

			TreeNode temp = queue.poll();
			v.add(temp.getData());

			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
				parentChildMap.put(temp.getLeft(), temp);
			}
			if (temp.getRight() != null) {

				queue.add(temp.getRight());
				parentChildMap.put(temp.getRight(), temp);

			}
		}

		return parentChildMap;
	}

}