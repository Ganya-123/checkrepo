public class Circle {
    private double radius=1.0;
    private double area;
    private String color = "red";

    public Circle(){

    }
    public Circle(int radius)
    {
        this.radius=radius;
        System.out.println(radius);
    }

    public Circle(double area){
        this.area=area;
        System.out.println(area);
    }
public double getRadius(){
        return radius;
}
public double getArea() {
        area=3.14*radius*radius;
    return area;
}

public static void main(String[]args)
{
Circle cir =new Circle(3);
System.out.println(cir.getArea());
}
}
