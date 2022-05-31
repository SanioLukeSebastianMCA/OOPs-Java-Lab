package Graphics;

interface AreaInterface {
    void Area();
}

public class Square implements AreaInterface{
    double side;
    public Square(double side){
        this.side= side;
    }
    public void Area() {
        double area= this.side * this.side;
        System.out.println("The area of the given square is : "+area);
    }
}