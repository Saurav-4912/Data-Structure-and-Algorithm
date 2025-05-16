package Queue;

public class StaticQueue {
  private int queue[];
	
	private int rear;
	
	private int front;
	
	public StaticQueue(int n) {
		
		queue = new int[n];
		
		rear = -1;
		
		front = -1;
	}

  // Check Static Queue is empty or not
  public boolean isEmpty(){
    return rear == front;
  }
}
