package com.bst;

public interface INode<K extends Comparable<K>> {
	K getKey();

	void setKey(K key);

	INode<K> getRight();

	void setRight(INode<K> right);

	INode<K> getLeft();

	void setLeft(INode<K> left);
}
