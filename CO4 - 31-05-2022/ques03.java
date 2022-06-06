import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String error){
        super(error);
    }
}

public class ques03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of integers you want to enter : ");
        int size= sc.nextInt();
        System.out.println("\n");

        int arr[]= new int[size];
        int i=0;
        while(i < size){
            int num;
            System.out.print("Enter the number "+(i+1)+" : ");
            num= sc.nextInt();
            try{
                if(num < 0){
                    sc.close();
                    throw new NegativeNumberException("No negative number allowed !! Please try again !!");
                }
                else{
                    arr[i]= num; 
                    i++;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

        int sum=0;
        System.out.print("The elements of the array are : [");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+", ");
            sum+=arr[i];
        }
        System.out.print(" ]\n");

        System.out.print("Now, The average of "+size+" no of elements is: "+(sum / size));
        sc.close();
    }
}
