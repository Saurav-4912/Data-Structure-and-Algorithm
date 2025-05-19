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