package Queue;

import java.util.NoSuchElementException;

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

  // Check Static Queue is full or not
  public boolean isFull() {
		return rear == queue.length-1;
	}

  // Add data into the queue
  public boolean add(int item) {
		if(isFull()) {
			throw new IllegalStateException("Queue is Full");
		}else {
			rear++;
			queue[rear] = item;
			return true;
		}
	}

  // Add data into the queue
  public boolean offer(int item) {
		if(isFull()) {
			return false;
		}else {
			rear++;
			queue[rear] = item;
			return true;
		}
	}


  // Remove first data from queue
  public int remove() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}else {
			front++;
			return queue[front];
		}
	}

  //To get first data from the queue
  public Integer peek() {
		if(isEmpty()) {
			return null;
		}else {
			
			return queue[front+1];
		}
	}

  //Remove first data from the queue
  public Integer poll() {
        if (isEmpty()) {
            return null;
        } else {
            front++;
            return queue[front];
        }
    }
    
  // Print queue using toString() method
}
