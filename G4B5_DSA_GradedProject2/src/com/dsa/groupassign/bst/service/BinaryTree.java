package com.dsa.groupassign.bst.service;

public class BinaryTree {
	private Node prevNode = null;
	private Node headNode = null;

	public Node flattenBSTToSkewed(Node root) {
		if (root != null) {
			flattenBSTToSkewed(root.left);

			Node rightNode = root.right;

			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}

			flattenBSTToSkewed(rightNode);
		}
		return headNode;
	}

	public void traverseRightSkewed(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			traverseRightSkewed(root.right);
		}
	}
}