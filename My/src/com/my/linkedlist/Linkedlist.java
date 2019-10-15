package com.my.linkedlist;

public class Linkedlist {
Node head;
public void inser(int data) {
Node node  =  new Node(data);
node.next = head;
head = node;
}
public int count() {
	Node n = head;
	int c=0;
	
while(n.next!= null) {
	n= n.next;
	c++;
}
return c;
}
public void delist() {
	head = null;
}
public void delpos(int pos) {
	Node temp = head , prev =  null;
	if(head ==null) {
		return;
	}
	if(pos == 0) {
		head = temp.next;
		return;
	}
	
	for(int i =0 ; temp!=null&& i<pos-1;i++) {
		temp = temp.next;
	}
	
	if(temp ==  null)
{
		return;
		
		}
	prev = temp.next;
	temp.next = prev.next; 
	
}
public  void delkey(int key) {
	Node temp = head, prev = null;
	if(temp!= null && temp.data == key) {
		head = temp.next;
		return;
	}
	while (temp!=null && temp.data != key ) {
		prev = temp;
		temp = temp.next;
	}
	if(temp == null) {
		return;
	}
	prev.next =  temp.next;
}
public void inserlast(int data) {
	Node node = new Node(data);
	if(head==null) {
		head =  new  Node(data);
		return;
	}
		Node n = head;
	
	while(n.next!=null) {
		n=n.next;
	}
	node.next =  n.next;
	n.next = node;
}
public void insertAt(int index ,  int data) {
	Node node  =   new Node(data);
	Node n = head;
	int y = count();
	System.out.println(y+"jhggfhgf");
	if(index == 0 ) {
		inser(data);
		return;
	}
	for(int i=0;i<index -1 ; i++) {
		n =  n.next;
	}
	 node.next = n.next;
	 n.next = node;
	
}
 
public  void show() {
	Node n = head;
	while(n.next !=null) {
		System.out.println(n.data+" ");
	n = n.next;
			}
	System.out.println(n.data);
}
}
