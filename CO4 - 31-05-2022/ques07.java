import java.util.*;

public class ques07 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue= new PriorityQueue<>();
        Scanner sc= new Scanner(System.in);
        boolean iscontinue= true;
        int choice;

        while(iscontinue){

            System.out.println("\nFollowing are the operations that you can perform on a PriorityQueue:\n1. Insertion of an element.\n2. Deletion of an element.\n3. Display the top element (peek).\n4. Exit");
            System.out.print("Select your choice: ");
            choice= sc.nextInt();

            switch(choice){
                case 1: {
                    System.out.print("\nEnter the element that you want to insert: ");
                    queue.add(sc.nextInt());
                    break;
                }

                case 2: {
                    if(queue.size() <= 0)
                        System.out.println("\nCannot delete from the queue !! Queue is empty !!");
                    else
                        System.out.println("The deleted element is : "+queue.poll());
                    break;
                }

                case 3: {
                    if(queue.size() <= 0)
                        System.out.println("\nCannot delete from the queue !! Queue is empty !!");
                    else
                        System.out.println("The top element (peek) is : "+queue.peek());
                    break;
                }

                case 4: {
                    iscontinue= false;
                    break;
                }

                default:{
                    System.out.println("\nInvalid choice !! Please try again !!");
                }
            }
        }
        sc.close();
    }
}
