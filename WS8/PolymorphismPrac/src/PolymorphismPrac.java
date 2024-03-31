import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape {
    double x;
    double y;

    abstract void calculateArea();

    abstract void calculateCircumference();

    void setX(double x) {
        this.x = x;
    }

    double getX() {
        return x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getY() {
        return y;
    }

    double getArea() {
        return 0.0;
    }
//    void pr(String msg)
//    {
//        System.out.print("\nAbstract : " + msg);
//    }
}

class Circle extends Shape {
    private double radius;
    private double area = 0.0;
    private double circumference = 0.0;

    Circle() {
        x = 0;
        y = 0;
        radius = 0;
    }

    Circle(double rad) {
        x = 0;
        y = 0;
        radius = rad;
        calculateArea();
        calculateCircumference();
    }

    Circle(double x, double y, double rad) {
        this.x = x;
        this.y = y;
        radius = rad;
        calculateArea();
        calculateCircumference();
    }

    void setRadius(double rad) {
        radius = rad;
        calculateArea();
        calculateCircumference();
    }

    double getRadius() {
        return radius;
    }

    void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getArea() {
        return area;
    }

    void calculateCircumference() {
        circumference = 2 * Math.PI * radius;
    }

    double getCircumference() {
        return circumference;
    }
}

class Rectangle extends Shape {
    private double height;
    private double width;
    private double area = 0.0;
    private double circumference = 0.0;

    Rectangle() {
        x = 0;
        y = 0;
        height = 0;
        width = 0;
    }

    Rectangle(double x, double y, double ht, double wd) {
        this.x = x;
        this.y = y;
        height = ht;
        width = wd;
        calculateArea();
        calculateCircumference();
    }

    void setHeight(double ht) {
        height = ht;
        calculateArea();
        calculateCircumference();
    }

    double getHeight() {
        return height;
    }

    void setWidth(double wd) {
        width = wd;
        calculateArea();
        calculateCircumference();
    }

    double getWidth() {
        return width;
    }

    void calculateArea() {
        area = height * width;
    }

    @Override
    double getArea() {
        return area;
    }

    void calculateCircumference() {
        circumference = 2 * (height + width);
    }

    double getCircumference() {
        return circumference;
    }
}

class Triangle extends Shape {
    private double height;
    private double base;
    private double area = 0.0;
    private double circumference = 0.0;

    Triangle() {
        x = 0;
        y = 0;
        height = 0;
        base = 0;
    }

    Triangle(double x, double y, double ht, double b) {
        this.x = x;
        this.y = y;
        height = ht;
        base = b;
        calculateArea();
        calculateCircumference();
    }

    void setHeight(double ht) {
        height = ht;
        calculateArea();
        calculateCircumference();
    }

    double getHeight() {
        return height;
    }

    void setBase(double b) {
        base = b;
        calculateArea();
        calculateCircumference();
    }

    double getBase() {
        return base;
    }

    void calculateArea() {
        area = (height * base) / 2;
    }

    @Override
    double getArea() {
        return area;
    }

    void calculateCircumference() {
        circumference = 3 * base;
    }

    double getCircumference() {
        return circumference;
    }
}

public class PolymorphismPrac {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner kb = new Scanner(System.in);
        ArrayList<Shape> ShArrList = new ArrayList<>();
        int cnt = 0;
        while (cnt < 12) {
            double rv1 = getAVal();
            double rv2 = getAVal();
            double rv3 = getAVal();
            Circle c1 = new Circle(rv1, rv2, rv3);
            ShArrList.add(c1);
            cnt++;

            rv1 = getAVal();
            rv2 = getAVal();
            rv3 = getAVal();
            double rv4 = getAVal();
            Rectangle r1 = new Rectangle(rv1, rv2, rv3, rv4);
            ShArrList.add(r1);
            cnt++;

            Triangle t1 = new Triangle(rv1, rv2, rv3, rv4);
            ShArrList.add(t1);
            cnt++;
        }
        pr("\n" + getInfo(ShArrList));
    }

    static StringBuilder getInfo(ArrayList<Shape> ShArrList) {
        DecimalFormat df = new DecimalFormat();
        StringBuilder sb = new StringBuilder();
        //foreach loop
        for (Shape s : ShArrList) {
            if (s instanceof Circle) {
                Circle c1 = (Circle) s; // Type cast from Shape to Circle
                sb.append("\n" + c1.getClass() + " with radius : " + df.format(((Circle) s).getRadius()) +
                        ", Centered at X : " + s.getX() +
                        ", Y : " + s.getY() +
                        "\nHas area : " + df.format(s.getArea()) +
                        "\nHas circumference : " + df.format(((Circle) s).getCircumference()));
            }
            if (s instanceof Rectangle) {
                Rectangle r1 = (Rectangle) s; // Type cast from Shape to Circle
                sb.append("\n" + r1.getClass() + " with height : " + df.format(((Rectangle) s).getHeight()) +
                        " and width : " + df.format(((Rectangle) s).getWidth()) +
                        ", Centered at X : " + s.getX() +
                        ", Y : " + s.getY() +
                        "\nHas area : " + df.format(s.getArea()) +
                        "\nHas circumference : " + df.format(((Rectangle) s).getCircumference()));
            }
            if (s instanceof Triangle) {
                Triangle t1 = (Triangle) s; // Type cast from Shape to Circle
                sb.append("\n" + t1.getClass() + " with height : " + df.format(((Triangle) s).getHeight()) +
                        " and base : " + df.format(((Triangle) s).getBase()) +
                        ", Centered at X : " + s.getX() +
                        ", Y : " + s.getY() +
                        "\nHas area : " + df.format(s.getArea()) +
                        "\nHas circumference : " + df.format(((Triangle) s).getCircumference()));
           }
        }
        return sb;
    }

    static double getAVal() {
        // Generate a random double between 0.1 and 100
        double randomValue = 0.1 + Math.random() * 4;
        // Round the generated value to two decimal places
        BigDecimal roundedValue = BigDecimal.valueOf(randomValue).setScale(2, RoundingMode.HALF_UP);
        // Use the rounded value as a double
        return roundedValue.doubleValue();
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
}
