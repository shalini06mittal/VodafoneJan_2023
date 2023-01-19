package ds;

import java.util.EmptyStackException;

public class MyStack {

	static final int MAX = 5;
	int top;
	int stack[];
	public MyStack() {
		stack = new int[MAX];
		top =-1;
	}
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull()
	{
		return top == MAX-1;
	}
	boolean push(int x)
	{
		if(isFull()) {
			System.out.println("Overflow");
			return false;
		}
		stack[++top] = x;
		return true;
	}
	int pop()
	{
		if(isEmpty()) {
			System.out.println("Underflow");
			throw new EmptyStackException();
		}
		return stack[top--];
	}
	
	
	
}
