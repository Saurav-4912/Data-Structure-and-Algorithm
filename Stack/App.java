package Stack;

public class App {
  public static void main(String[] args) {
    
    StaticStack st = new StaticStack(10);

    boolean status = st.isEmpty();
    System.out.println("Is Empty : " + status);

    boolean status1 = st.isFull();
    System.out.println("Is Full : " + status1);
  }
}
