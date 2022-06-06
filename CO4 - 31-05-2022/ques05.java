import java.util.Scanner;

public class ques05 {
    public static void main(String[] args) {
        
        int choice, isexit=0;
        Scanner sc= new Scanner(System.in);

        int stack_size, top=-1;
        System.out.print("\nEnter the size of the stack : ");
        stack_size= sc.nextInt();

        int[] a= new int[stack_size];

        while(isexit==0){
            System.out.println("\nSelect from the following stack operations that you want to perform :\n1. Push an element.\n2. Pop an element.\n3. Display the stack.\n4. Exit");
            System.out.print("\nEnter the choice: ");
            choice= sc.nextInt();

            switch(choice){
                case 1:{
                    int new_element;
                    System.out.print("\nEnter the new element you want to add : ");
                    new_element= sc.nextInt();
                    if(top >= stack_size-1){
                        System.out.println("\nStack Overflow !! Cannot push anymore elements; Stack is full !!");
                    }
                    else{
                        a[++top]=new_element;
                    }
                    break;
                }

                case 2:{
                    if(top==-1){
                        System.out.println("Stack underflow !! Cannot pop anymore elements; Stack is empty !!");
                    }
                    else{
                        int pop_element= a[top--];
                        System.out.println("\nThe popped element is : "+pop_element);
                    }
                    break;
                }

                case 3:{
                    if(top < 0){
                        System.out.println("Stack underflow !! Cannot display any elements; Stack is empty !!");
                    }
                    else{
                        System.out.print("\nThe elememts in the stack are : [");
                        for(int i=0;i<=top;i++){
                            if(i==top)
                                System.out.print(a[i]);
                            else
                                System.out.print(a[i]+", ");
                        }
                        System.out.print("]");
                    }
                    break;
                }

                case 4:{
                    isexit=1;
                    break;
                }

                default:{
                    System.out.println("\nInvalid choice. Please try again !!");
                }
            }
        }

        sc.close();
    }
}
