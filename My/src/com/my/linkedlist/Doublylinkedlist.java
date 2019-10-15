package com.my.linkedlist;
import java.util.*;

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
 public void append(int new_data) {
	 Node new_node = new Node(new_data);
	 if(head == null) {
		 new_node.prev = null;
		 
		 head = new_node;
		 return;
	 }
	  new_node.next = null;
	  Node last = head.next;
	  while (last.next != null) {
		  last = last.next;
	  }
	  last.next  =  new_node;
	new_node.prev  =  last; 
 }
 public void insert(Node prev ,  int new_data) {
	  
	  if(prev == null) {
		  System.out.println("Error");
		  return;
	  }
	  Node new_node =  new Node(new_data);
	  new_node.next =  prev.next;
	  prev.next = new_node;
	  new_node = prev; 
	  if(new_node.next != null) {
		  new_node.next.prev =  new_node;
	  }
 }
public void print() {
	Node node1 = head;
	System.out.println("Traversal in forward Direction"); 
     while (node1 != null) { 
         System.out.print(node1.data + " "); 
         node1 = node1.next; 
     } 
	
		
}

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in) ;
		int n = s.nextInt();
	
	Doublylinkedlist l =  new Doublylinkedlist();
	l.push(4);

	for(int i =0; i<n;i++) {
		l.push(s.nextInt());
	}
	l.append(456);
	l.append(647);
	l.append(562);
	l.append(9984);
	l.insert(l.head.next, 5757344);
	
    l.print();
	
	}

}
