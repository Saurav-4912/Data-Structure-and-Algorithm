package Queue;

class DynamicQueue {
  private Node first;
	private Node last;
	private int count;

	public DynamicQueue() {
		this.first = null;
		this.last = null;
		this.count = 0;
	}

  	public boolean isEmpty() {
		return first == null; // count = 0; or first == last
	}

  	public boolean add(int item) {
		Node node = new Node(item);
		if (first == null) {
			first = node;
			last = node;
			count++;
			return true;
		} else {
			last.next = node;
			node.prev = last;
			last = node;
			count++;
			return true;
		}
	}

	private static class Node {
		private Node next;
		private Node prev;
		private int data;

		public Node(int data) {
			this.next = null;
			this.prev = null;
			this.data = data;
		}
	}
}