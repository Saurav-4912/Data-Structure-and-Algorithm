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
}
