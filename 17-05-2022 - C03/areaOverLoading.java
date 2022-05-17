import java.util.*;

class areaOverLoading{
	
	private void area(int side){
		int area= side*side; 
		System.out.println("The area of square is "+area+"sqcm");
	}
	
	private void area(int length, int breadth){
		int area= length*breadth; 
		System.out.println("The area of rectangle is "+area+"sqcm");
	}
	
	private void area(double length, double breadth){
		double area= (length*breadth)/2; 
		System.out.println("The area of triangle is "+area+"sqcm");
	}
	
	private void area(double radius){
		double area= 3.14*radius*radius; 
		System.out.println("The area of circle is "+area+"sqcm");
	}
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int length1,breadth1,side;
		double radius,length2,breadth2;
		areaOverLoading area= new areaOverLoading();
		
		System.out.println("\nChoose the Operations to perform:\n1. Area of square.\n2. Area of rectangle.\n3. Area of triangle.\n4. Area of circle.\n");
		int ch= sc.nextInt();
		
		switch(ch){
			case 1:{
				System.out.println("\nEnter the value of side of the square: ");
				side= sc.nextInt();
				area.area(side);
				break;
			}
			
			case 2:{
				System.out.println("\nEnter the value of length of the rectangle: ");
				length1= sc.nextInt();
				System.out.println("\nEnter the value of breadth of the rectangle: ");
				breadth1= sc.nextInt();
				area.area(length1, breadth1);
				break;
			}
			
			case 3:{
				System.out.println("\nEnter the value of base of the triangle: ");
				length2= sc.nextDouble();
				System.out.println("\nEnter the value of height of the rectangle: ");
				breadth2= sc.nextDouble();
				area.area(length2, breadth2);
				break;
			}
			
			case 4:{
				System.out.println("\nEnter the value of radius of the circle: ");
				radius= sc.nextDouble();
				area.area(radius);
				break;
			}
		}
		
	}
}