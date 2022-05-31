package Graphics;

interface AreaInterface {
    void Area();
}

public class Circle implements AreaInterface{
    double radius;
    public Circle(double radius){
        this.radius= radius;
    }
    public void Area() {
        double area= 3.14 * this.radius * this.radius;
        System.out.println("The area of the given circle is : "+area);
    }
}