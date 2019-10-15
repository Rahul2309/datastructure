package com.my.linkedlist;

public class Doublylinkedlist {
	Node head;
	
	
	 public static class Node{
		 int data;
			Node next;
			Node prev;
		 Node(int d){
        		 data = d;
		 }
	 }
	 
public void push (int new_data) {
	Node new_node =  new Node(new_data);
	new_node.next = head;
	new_node.prev = null;
	if(head!=null) {
		head.prev =  new_node;
		
	}
	head= new_node ;
	
}
public void print(Node node) {
	Node last = null;
	 System.out.println("Traversal in forward Direction"); 
     while (node != null) { 
         System.out.print(node.data + " "); 
         last = node; 
         node = node.next; 
     } 
	while(last != null) {
		System.out.println(last.data+" ");
	last = last.prev;
	}
		
}
	public static void main(String[] args) {
	Doublylinkedlist l =  new Doublylinkedlist();
	l.push(4);
	l.push(9);
	l.push(4);
	l.push(2);
    l.print(l.head);
	
	}

}
