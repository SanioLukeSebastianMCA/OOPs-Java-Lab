import java.util.*;

public class Car{
	public static void main(String[] args){
		String name;
		System.out.print("Please enter your car name : ");
		Scanner sc= new Scanner(System.in);
		name= sc.nextLine();
		System.out.println("The entered car name is : "+name);
	}
}