package Stack;

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
  
  
}
