package com.my.linkedlist;

public class Linked {
	Node head; 
	static class Node{
		int data ;
		Node next;
		Node(int d){
			data = d;
			next = null;
			
		}
	}
	 
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void last(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
			
		}
		new_node.next = null;
		Node last = head;
		
		while (last.next !=null) {
			last = last.next;}
			last.next = new_node;
		return;
	}
 public void print() {
	  Node n = head;
	  
	  while(n != null) {
		  System.out.println(n.data);
		  n = n.next;
		  
	  }
 }
	public void middle(Node prev, int new_data) {
	
	if(prev == null) {
		System.out.println("ggdgfd");
		return;
	}
	Node new_node =new Node(new_data);
	new_node.next = prev.next;
	prev.next = new_node ; 
	}
	public void delet(int key) {
		Node  temp = head , prev = null;
		if(temp != null && temp.data==key) {
			head = temp.next; return;
			
		}
		while(temp !=null && temp.data!=key ) {
			prev = temp;
			temp = temp.next;
			
		}
		if(temp == null) {
			return;
				
		}
		prev.next = temp.next;
	}
	public void depo(int pos) {
		if(head == null) {
			return;
		}
		 Node temp = head;
		 if(pos ==0) {
			 head = temp.next;
			 return;
		 }
		 for(int i=0; temp != null && i<pos-1 ; i++) {
			 temp = temp.next;
			 
		 }
		 if(temp == null || temp.next == null) {
			 return;
		 }
		 Node next = temp.next.next;
		 temp.next = next;
	}
	public int count() {
		Node temp=  head;
		int c =0 ;
		while(temp!=null) {
			
			temp = temp.next;
			c++;
		}
		return c;
	}
	public void delist() {
		head = null;
	}
	public static void main(String[] args) {
	  Linked l =  new Linked();
	 
	  l.push(1);
	  
	  l.push(5);
	  l.push(6);
	  l.push(54); 
	  l.delist();
	  l.push(98); 
	  l.push(45); 
	  l.push(12); 
	
	 l.print();
	System.out.println(l.count()); 
	}

}
