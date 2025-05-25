package Queue;

public class MyDeque {
  private Node first;
	private Node last;
	private int count;

	public MyDeque() {
		this.first = null;
		this.last = null;
		this.count = 0;
	}

	private static class Node {
		private Node prev;
		private int data;
		private Node next;

		public Node(int data) {
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}

  // To check MyDeque is empty or not
  public boolean isEmpty() {
		return first == null;
	}

  // Add data to first
  public boolean addFirst(int data) {
		Node node = null;
		try {
			node = new Node(data);
		} catch (Exception e) {
			return false; // unable to allocate object on heap
		}
		if (first == null) {
			first = node;
			last = node;
			count = 1;
			return true;
		} else {
			node.next = first;
			first.prev = node;
			first = node;
			count++;
			return true;
		}

	}

}
