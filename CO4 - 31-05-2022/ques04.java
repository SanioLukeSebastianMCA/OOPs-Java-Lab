import java.util.Scanner;

class Fibonacci extends Thread{

    int size;
    Fibonacci(int size){
        this.size=size;
    }

    public void run(){
        int num1=0, num2=1;
        System.out.println("Fibonacci - 0, 1, ");
        for(int i=2;i<size;i++){
            int temp=num1;
            num1= num2;
            num2= temp+num1;
            System.out.println("Fibnacci - "+num2+", ");
        }
    }
}

class EvenNumber extends Thread{
    int range;
    EvenNumber(int range){
        this.range= range;
    }

    public void run(){
        for(int i=0;i<range;i++){
            if(i%2==0){
                System.out.println("The even number : "+i);
            }
        }
    }
}

public class ques04 {
    public static void main(String[] args) {

        int size, range;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of fibonacci series : ");
        size= sc.nextInt();

        System.out.println("Enter the range of even numbers : ");
        range= sc.nextInt();

        Fibonacci fib= new Fibonacci(size);
        EvenNumber even= new EvenNumber(range);
        fib.start();
        even.start();

        sc.close();
    }
}
