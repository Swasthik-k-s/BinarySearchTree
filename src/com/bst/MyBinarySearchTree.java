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
	
	void print() {
		printPreorder(root);
	}
}
