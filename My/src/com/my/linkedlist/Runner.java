package com.my.linkedlist;

public class Runner {
public static void main(String[] args) {
	Linkedlist  l = new Linkedlist();
	l.inser(5);
	l.inser(5);
	
	l.inser(5);
	l.inser(5);
	l.inser(5);
	
	l.inserlast(1);
	l.insertAt(2,6);
	l.delpos(2);
	l.show();
}

}
