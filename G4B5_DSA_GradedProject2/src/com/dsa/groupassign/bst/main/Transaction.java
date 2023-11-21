package com.dsa.groupassign.bst.main;

import com.dsa.groupassign.bst.service.BinaryTree;
import com.dsa.groupassign.bst.service.Node;

public class Transaction {
	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		BinaryTree operations = new BinaryTree();
		Node skewedTree = operations.flattenBSTToSkewed(root);
		operations.traverseRightSkewed(skewedTree);
	}
}
