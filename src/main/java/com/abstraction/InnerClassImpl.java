package com.abstraction;

import com.abstraction.LinkedList.Node;

class LinkedList {

	static class Node {
		int value;
		Node next;
		
		static void printNode() {
			System.out.println("Node");
		}
	}

	Node head;
	Node tail;
	int length;
}

public class InnerClassImpl {

	public static void main(String[] args) {
		Node.printNode();
	}

}
