package com.my.linkedlist;

public class Stack {
	int n =2;
int  stack[] =new int[n];
int top=0;
	 public void push(int data) {
		 if(size()==n)
			 expand();
		 stack[top] = data;
		 top++;
		 }
	 private void expand() {
int len = size();
int newstack[] = new int[n*2];
System.arraycopy(stack, 0, newstack, 0, len);
stack  =  newstack;
n=n*2;
	}
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
				top--;
				data = stack[top];
				stack[top] = 0;
				shrink();
				}
		 return  data;
	 
		}
	 
	 public void show() {
		 for(int i : stack) {
			 System.out.print(i +" ");
		 }}
	 public int size() {
		 return top;
	 }
	  public int peek() {
		  int data = stack[top-1];
		return data;
	  }
	 public boolean isEmpty() {
		 
		 return top<=0;
	 }
	 public void shrink() {
		 int len = size();
		 if(len <= (n/2)/2 ) {
			 n/=2;
			 int newstack[] = new int[n];
			 System.arraycopy(stack, 0, newstack, 0, len);
			 stack  =  newstack;
		 }
	 }
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(15);
		s.push(54);
		s.push(65);
			s.push(65);
			s.push(65);
			s.push(65);
			s.push(65);
			s.push(65);
			s.push(65);
			s.push(65);

	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	
	
	  
	  System.out.println(s.size());
	System.out.println(s.isEmpty());
		s.show();
	}
}
