import java.util.*;

interface ShapeCalculate{
    double area();
    double perimeter();
}

class Circle implements ShapeCalculate{
    int radius;

    Circle(int radius){
        this.radius= radius;
    }

    @Override
    public double area() {
        return (3.14*this.radius*this.radius);
    }

    @Override
    public double perimeter() {
        return (2*3.14*this.radius);
    }
}

class Rectangle implements ShapeCalculate{
    int length, breadth;

    Rectangle(int length, int breadth){
        this.length= length;
        this.breadth= breadth;
    }

    @Override
    public double area() {
        return (this.length*this.breadth);
    }

    @Override
    public double perimeter() {
        return (2*(this.length+this.breadth));
    }
}

public class shapeInterface {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice, isexit=0;

        while(true){
            System.out.println("Matheatical Operations: \n1. Area of a Rectangle.\n2. Perimeter of a Rectangle.\n3. Area of a circle.\n4. Perimeter of a circle.\n5. Exit\n");
            System.out.print("Please enter the choice: ");
            choice= sc.nextInt();
            switch(choice){
                case 1: {
                    int length, breadth;
                    System.out.print("\nEnter the length of the rectangle: ");
                    length= sc.nextInt();

                    System.out.print("\nEnter the length of the rectangle: ");
                    breadth= sc.nextInt();

                    ShapeCalculate rectangleshape= new Rectangle(length, breadth);
                    System.out.println("The area of the mentioned rectangle is : "+rectangleshape.area()+"sqcm");
                    break;
                } 
                
                case 2: {
                    int length, breadth;
                    System.out.print("\nEnter the length of the rectangle: ");
                    length= sc.nextInt();

                    System.out.print("\nEnter the length of the rectangle: ");
                    breadth= sc.nextInt();

                    ShapeCalculate rectangleshape= new Rectangle(length, breadth);
                    System.out.println("The perimeter of the mentioned rectangle is : "+rectangleshape.perimeter()+"cm");
                    break;
                } 

                case 3: {
                    int radius;
                    System.out.print("\nEnter the radius of the circle: ");
                    radius= sc.nextInt();

                    ShapeCalculate circleshape= new Circle(radius);
                    System.out.println("The area of the mentioned rectangle is : "+circleshape.area()+"sqcm");
                    break;
                } 

                case 4: {
                    int radius;
                    System.out.print("\nEnter the radius of the circle: ");
                    radius= sc.nextInt();

                    ShapeCalculate circleshape= new Circle(radius);
                    System.out.println("The perimeter of the mentioned rectangle is : "+circleshape.perimeter()+"cm");
                    break;
                } 

                case 5: {
                    isexit=1;
                    break;
                } 
            }

            if(isexit==1){
                break;
            }
        }
    
    }
}
