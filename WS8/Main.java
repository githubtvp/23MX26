abstract class Shape {
    int x;
    int y;

    abstract double calculateArea();

    abstract double circumference();

    void pr(String msg)
    {
        System.out.print("\nAbstract : " + msg);
    }
}

class Circle extends Shape
{
    Circle()
    {
        x = 0;
        y = 0;
    }
    Circle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    double calculateArea()
    {
        double area= 0.0;

        return area;
    }

    double circumference()
    {
        double cirfrence = 0.0;

        return cirfrence;
    }
}

public class Main
{
    public static void main(String[] args) {



    }
}
