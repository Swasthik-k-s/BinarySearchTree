package com.bst;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
	private K key;
	private INode<K> right;
	private INode<K> left;
	
	MyBinaryNode(K key){
		this.key = key;
		this.right = null;
		this.left = null;
	}
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	@Override
	public INode<K> getRight() {
		return this.right;
	}
	@Override
	public void setRight(INode<K> right) {
		this.right = right;
	}
	@Override
	public INode<K> getLeft() {
		return this.left;
	}
	@Override
	public void setLeft(INode<K> left) {
		this.left = left;
	}

}
