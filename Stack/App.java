package Stack;

public class App {
  public static void main(String[] args) {
    
    StaticStack st = new StaticStack(10);

    boolean status = st.isEmpty();
    System.out.println("Is Empty : " + status);

    boolean status1 = st.isFull();
    System.out.println("Is Full : " + status1);

    st.push(11);
    st.push(22);
    st.push(33);
    st.push(44);
    st.push(55);

    System.out.println(st);

    System.out.println("Size of Stack : " + st.size());

    System.out.println("Popped Data : " + st.pop());

    System.out.println("Peek Data : " + st.peek());
    
  }
}
