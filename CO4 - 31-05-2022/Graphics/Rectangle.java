package Graphics;

interface AreaInterface {
    public void Area();
}

public class Rectangle implements AreaInterface{
    double length, breadth;
    public Rectangle(double length, double breadth){
        this.length= length;
        this.breadth= breadth;
    }
    public void Area() {
        double area= 0.5 * this.length * this.breadth;
        System.out.println("The area of the given rectangle is : "+area);
    }
}