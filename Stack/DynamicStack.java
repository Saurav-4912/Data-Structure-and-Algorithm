package Stack;

import java.util.EmptyStackException;

public class DynamicStack {
  
  private Node first;
  private Node top;
  private int count;

  public DynamicStack(){
    this.first = null;
		this.top = null;
		this.count = 0;
  }
 
	private static class Node {

		Node prev;
		int data;
		Node next;

		public Node(int data) {
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}

  public boolean isEmpty(){
    return top==null;
  }

  public int size(){
    return count;
  }
  

  // Added data into stack
  public void push(int item){

    Node T = new Node(item);
    if(isEmpty()){
      first = T;
      top = T;
    }else{
      top.next = T;
      T.prev = top;
      top = top.next;
    }
    count++;
  }
  
  // Remove topmost element from stack
  public int pop() 
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		} else
		{
			int data = top.data;

			if (top == first)
			{
				first = null;
				top = null;
				count = 0;
				return data;
			} 
			else 
			{
				Node T = top;
				top = top.prev;
				top.next = null;
				T.prev = null;
				count--;

				return data;
			}
		}

	}
}
