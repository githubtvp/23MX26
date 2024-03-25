public class Circle {

    private double  radius = 1.0;
    private String color = "Red";

    Circle()
    {
        this.radius = 1.0;
        this.color = "Red";
    }
    Circle(double r)
    {
        this.radius = r;
    }
    double getRadius()
    {
        return radius;
    }

    void setRadius(double r)
    {
        radius = r;
    }

    double getArea()
    {
        return Math.PI*radius*radius;
    }

    double getCircumference()
    {
        return 2* Math.PI*radius;
    }

    @Override
    public String toString()
    {
        return ("Circle : Radius : " + radius + "\n\t Area : " + getArea() );
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        System.out.print(c1.toString());
    }
}
