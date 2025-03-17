package DoublyLinkedList;

class LinkedListS {
  private Node first;
  private int count;
  private Node last;

  private static class Node {
    private Node prev;
    private String data;
    private Node next;

    public Node(String data) {
      this.prev = null;
      this.data = data;
      this.next = next;
    }

  }

  public LinkedListS() {
    this.first = null;
    this.count = 0;
    this.last = null;
  }

  public void add(String data){
    if(first==null){
      Node temp = new Node(data);
      first = temp;
      last = temp;
      count++;
    }else{
      Node temp = new Node(data);
      last.next = temp;
      last.next.prev = last;
      last = last.next;
      count++;
    }
  }
  public int size()
  {
    return count;
  }
}

public class Test {
  public static void main(String[] args) {

    LinkedListS L = new LinkedListS();
    L.add("AAA");
    L.add("BBB");

    System.out.println(L.size());
  }
}
