package com.bst;

public class MyBinarySearchTree<K extends Comparable<K>> {

	MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root,key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current,K key){
		if(current == null) {
			return new MyBinaryNode<K>(key);
		}
		int compare = key.compareTo(current.getKey());
		if(compare == 0) {
			return current;
		}
		if(compare > 0) {
			current.setRight(addRecursively((MyBinaryNode<K>) current.getRight(), key));
		} else {
			current.setLeft(addRecursively((MyBinaryNode<K>) current.getLeft(), key));
		}
		return current;
	}

	public void printPreorder(MyBinaryNode<K> node) {
		if(node == null) {
			return;
		}
		System.out.print(node.getKey() + "-->");
		printPreorder((MyBinaryNode<K>) node.getLeft());
		printPreorder((MyBinaryNode<K>) node.getRight());
	}

	public void print() {
		printPreorder(root);
		System.out.println();
	}

	public int getSize() {
		return getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		if (current == null) {
			return 0;
		}
		return 1 + getSizeRecursive((MyBinaryNode<K>) current.getLeft()) + getSizeRecursive((MyBinaryNode<K>) current.getRight());

	}

	public void search(K key) {
		searchNode(root, key);
	}

	private void searchNode(MyBinaryNode<K> current, K key) {
		if (current == null) {
			System.out.println(key + " not found");
			return;
		}
		int compare = key.compareTo(current.getKey());
		if (compare == 0) {
			System.out.println(key + " Found");
			return;
		}
		if (compare < 0) {
			searchNode((MyBinaryNode<K>) current.getLeft(), key);
		} else {
			searchNode((MyBinaryNode<K>) current.getRight(), key);
		}

	}
}
