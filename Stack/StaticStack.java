package Stack;

import java.util.EmptyStackException;

public class StaticStack {
  int stack[];
  int top;
  int capacity;

  public StaticStack(int capacity){
    if(capacity < 1)
    throw new IllegalArgumentException("Capacity should be greater than 0 ");

    this.capacity =capacity;
    stack = new int[capacity];
    top = -1;
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public boolean isFull(){
    return top == capacity-1;
  }

  public void push(int data) // Add element in the stack.
	{
		if(isFull())
		{
			throw new StackOverflowError("Stack is overflow");
		}
		else 
		{
			top++;
			stack[top] = data;
		}
	}

  public int pop() // Remove top most element from stack.
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			int data = stack[top];
			top--;
			
			return data;
			
		}
	}
}
