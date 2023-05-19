import java.util.*;
public class Collection6 {
	public static void main(String args[]) {
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("G");
		deque.add("A");
		deque.add("Az");
		
		for(String s: deque) {
			System.out.println(s);
		}
		deque.offerFirst("c");
		System.out.println("After offerFirst: ");
		for(String s: deque) {
			System.out.println(s);
		}
		
		deque.poll();
		System.out.println("new:");
		for(String s: deque) {
			System.out.println(s);
		}
		deque.pollFirst();
		System.out.println("new:");
		for(String s: deque) {
			System.out.println(s);
		}
		deque.peek();
		System.out.println("new:");
		for(String s: deque) {
			System.out.println(s);
		}
	}

}
