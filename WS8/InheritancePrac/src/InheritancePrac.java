
import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Shape {
    int x;
    int y;

    abstract void calculateArea();

    abstract void calculateCircumference();

//    void pr(String msg)
//    {
//        System.out.print("\nAbstract : " + msg);
//    }
}

class Circle extends Shape
{
    private double radius;
    private double area = 0.0;
    private double circumference = 0.0;

    Circle()
    {
        x = 0;
        y = 0;
        radius = 0;
    }
    Circle(double rad)
    {
        x = 0;
        y = 0;
        radius = rad;
        calculateArea();
        calculateCircumference();
    }
    Circle(int x, int y, double rad)
    {
        this.x = x;
        this.y = y;
        radius = rad;
        calculateArea();
        calculateCircumference();
    }

    void setRadius(double rad)
    {
        radius = rad;
        calculateArea();
        calculateCircumference();
    }

    double getRadius()
    {
        return radius;
    }
    void calculateArea()
    {
        area= Math.PI * Math.pow(radius, 2);
    }

    double getArea()
    {
        return area;
    }
    void calculateCircumference()
    {
        circumference = 2 * Math.PI * radius;
    }

    double getCircumference()
    {
        return  circumference;
    }
}

class Rectangle extends Shape
{
    private double height;
    private double width;
    private double area = 0.0;
    private double circumference = 0.0;

    Rectangle()
    {
        x = 0;
        y = 0;
        height = 0;
        width = 0;
    }
    Rectangle(double ht, double wd)
    {
        x = 0;
        y = 0;
        height = ht;
        width = wd;
        calculateArea();
        calculateCircumference();
    }
    void setHeight(double ht)
    {
        height = ht;
        calculateArea();
        calculateCircumference();
    }

    double getHeight()
    {
        return height;
    }

    void setWidth(double wd)
    {
        width = wd;
        calculateArea();
        calculateCircumference();
    }

    double getWidth()
    {
        return width;
    }

    void calculateArea()
    {
        area = height * width;
    }

    double getArea()
    {
        return area;
    }
    void calculateCircumference()
    {
        circumference = 2 * (height + width);
    }

    double getCircumference()
    {
        return circumference;
    }
}

class Triangle extends Shape
{
    private double height;
    private double base;
    private double area = 0.0;
    private double circumference = 0.0;

    Triangle()
    {
        x = 0;
        y = 0;
        height = 0;
        base = 0;
    }
    Triangle(double ht, double b)
    {
        x = 0;
        y = 0;
        height = ht;
        base = b;
        calculateArea();
        calculateCircumference();
    }
    void setHeight(double ht)
    {
        height = ht;
        calculateArea();
        calculateCircumference();
    }

    double getHeight()
    {
        return height;
    }

    void setBase(double b)
    {
        base = b;
        calculateArea();
        calculateCircumference();
    }

    double getBase()
    {
        return base;
    }

    void calculateArea()
    {
        area = (height * base)/2;
    }

    double getArea()
    {
        return area;
    }
    void calculateCircumference()
    {
        circumference = 3 * base;
    }

    double getCircumference()
    {
        return circumference;
    }
}
public class InheritancePrac
{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner kb = new Scanner(System.in);
        Circle c1 = new Circle(3);
        pr("\nCircle Radius :" + df.format(c1.getRadius()));
        pr("\nCircle Area :" + df.format(c1.getArea()));
        pr("\nCircle Circumference :" + df.format(c1.getCircumference()));

        Rectangle r1 = new Rectangle(3, 4);
        pr("\nRectangle Height :" + df.format(r1.getHeight()));
        pr("\nRectangle Width :" + df.format(r1.getWidth()));
        pr("\nRectangle Area :" + df.format(r1.getArea()));
        pr("\nRectangle Perimeter :" + df.format(r1.getCircumference()));

        Triangle t1 = new Triangle(2.598, 3);
        pr("\nTriangle Height :" + df.format(t1.getHeight()));
        pr("\nTriangle Base :" + df.format(t1.getBase()));
        pr("\nTriangle Area :" + df.format(t1.getArea()));
        pr("\nTriangle Perimeter :" + df.format(t1.getCircumference()));
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}
