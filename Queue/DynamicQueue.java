package Queue;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

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
  public int remove() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		} else {
			if (first == last) {
				int item = first.data;
				first = last = null;
				count = 0;
				return item;
			}
			int item = first.data;
			Node node = first;
			first = first.next;
			node.next.prev = null;
			node.next = null;

			count--;
			return item;
		}
	}

	public String toString() {
		StringJoiner sj = new StringJoiner(",", "[", "]");

		for (Node node = first; node != null; node = node.next) {
			sj.add(String.valueOf(node.data));
		}
		return sj.toString();
	}

	public Integer poll() {
		if (isEmpty()) {
			return null;
		} else {
			return remove();
		}
	}

	public Integer peek() {
		if (isEmpty()) {
			return null;
		} else {
			return first.data;
		}
	}

	public int size() {
		return count;
	}

  public boolean offer(int item) {
		return add(item);
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