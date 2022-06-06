package Graphics;

public class Triangle implements AreaInterface{
    double length, breadth;
    public Triangle(double length, double breadth){
        this.length= length;
        this.breadth= breadth;
    }
    public void Area() {
        double area= 0.5 * this.length * this.breadth;
        System.out.println("The area of the given triangle is : "+area);
    }
}