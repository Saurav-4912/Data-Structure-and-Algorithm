package Stack;

public class StaticStack {
  int stack[];
  int top;
  int capacity;

  public StaticStack(int capacity){
    if(capacity < 1)
    throw new IllegalArgumentException("Capacity should be greater than 0 ");

    this.capacity =capacity;
    stack = new int[capacity];
    top = -1;
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public boolean isFull(){
    return top == capacity-1;
  }
}
