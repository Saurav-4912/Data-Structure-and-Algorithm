package Queue;

public class Test {
  public static void main(String[] args) {
   StaticQueue sq = new StaticQueue(4);

		sq.add(11);
		sq.add(22);
		sq.add(33);
		System.out.println("Offer : " + sq.offer(44));

		System.out.println(sq);
		
		System.out.println("Peek : " + sq.peek());

		System.out.println("Remove : " + sq.remove());
		System.out.println("Poll : " + sq.poll());
		System.out.println("Poll : " + sq.poll());
		System.out.println("Remove : " + sq.remove());
		
		System.out.println("Is Empty : " + sq.isEmpty());
  }
}
