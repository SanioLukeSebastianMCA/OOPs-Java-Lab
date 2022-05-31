import java.util.*;
import Graphics.*;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice,isexit=0;

        while(isexit==0){
            double length, breadth, side, radius;
            System.out.println("\n1. Area of Triangle.\n2. Area of Circle.\n3. Area of Square.\n4. Area of Rectangle.\n5. Exit");
            System.out.print("Please enter the operation choice to perform - ");
            choice= sc.nextInt();
            System.out.println("\n");

            switch(choice){
                case 1:{
                    System.out.print("Enter the length of the triangle : ");
                    length= sc.nextDouble();
                    System.out.print("Enter the height of the triangle : ");
                    breadth= sc.nextDouble();
                    Triangle triangle = new Triangle(length, breadth);
                    triangle.Area();
                    break;
                }

                case 2:{
                    System.out.print("Enter the radius of the circle : ");
                    radius= sc.nextDouble();
                    Circle cir= new Circle(radius);
                    cir.Area();
                    break;
                }

                case 3:{
                    System.out.print("Enter the side length of the square : ");
                    side= sc.nextDouble();
                    Square square= new Square(side);
                    square.Area();
                    break;
                }

                case 4:{
                    System.out.print("Enter the length of the rectangle : ");
                    length= sc.nextDouble();
                    System.out.print("Enter the breadth of the rectangle : ");
                    breadth= sc.nextDouble();
                    Rectangle rec= new Rectangle(length, breadth);
                    rec.Area();
                    break;
                }

                case 5:{
                    isexit=1;
                    break;
                }

                default:{
                    break;
                }
            }
        }
        sc.close();
    }
}
