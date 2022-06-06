import java.util.*;

public class ques08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Deque<String> deque= new LinkedList<String>();

        // Add at the last
        deque.add("Item 1 - Tail");
 
        // Add at the first
        deque.addFirst("Item 2 - Head");
 
        // Add at the last
        deque.addLast("Item 3 - Tail");
 
        // Add at the first
        deque.push("Item 4 - Head");
 
        // Add at the last
        deque.offer("Item 5 - Tail");
 
        // Add at the first
        deque.offerFirst("Item 6 - Head");
 
        System.out.println(deque + "\n");

        // We can remove the first element or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing first and last: "+deque);

        sc.close();
    }
}
