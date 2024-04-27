
// Define an interface for shapes
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Implement the Shape interface for each shape type
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
// Define an enum for different shapes
enum ShapeType {
    SQUARE,
    CIRCLE,
    RECTANGLE
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        ShapeType shapeType = ShapeType.SQUARE;
        Shape shape;
        switch (shapeType) {
            case SQUARE:
                shape = new Square(5);
                break;
            case CIRCLE:
                shape = new Circle(3);
                break;
            case RECTANGLE:
                shape = new Rectangle(4, 6);
                break;
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
}
