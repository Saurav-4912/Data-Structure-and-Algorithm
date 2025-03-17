package DoublyLinkedList;

import java.util.StringJoiner;

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
  public int length(){
    return count;
  }

  public String toString(){
    StringJoiner str = new StringJoiner(",", "[", "]");
    for(Node temp = first; temp!=null; temp=temp.next){
      str.add(String.valueOf(temp.data));
    }

    return str.toString();
  }

  public void addFirst(String data){
    if(first == null){
      Node temp = new Node(data);
      first = temp;
      last=temp;
      count++;
    }else{
      Node temp = new Node(data);
      temp.next = first;
      temp.next.prev=temp;
      first = temp;
      count++;
    }
  }
  
  
}

public class Test {
  public static void main(String[] args) {

    LinkedListS L = new LinkedListS();
    L.add("Pune");
    L.add("Mumbai");
    L.add("Delhi");
    L.add("Banglore");

    System.out.println("LinkedList : " + L);
    System.out.println("No. Of Element : " + L.size());

    //L.addFirst("AAA");

    System.out.println("After LinkedList : " + L);
    System.out.println("No. Of Element : " + L.size());
  }
}
