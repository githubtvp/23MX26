public class Rectangle {

    float length = 1.0f;
    float width = 1.0f;

    Rectangle()
    {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    Rectangle(float l, float w)
    {
        this.length = l;
        this.width = w;
    }

    float getLength()
    {
        return length;
    }

    void setLength(float l)
    {
        length = l;
    }

    float getWidth()
    {
        return width;
    }

    void setWidth(float w)
    {
        width = w;
    }
    double getArea()
    {
        return length * width;
    }

    double getPerimeter()
    {
        return 2*(length + width);
    }
    @Override
    public String toString()
    {
        return ("Rectangle : Length : " + length + "\n    Width : " + width );
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.print("\n" + r1.toString());
        Rectangle r2 = new Rectangle(5, 2.5f);
        System.out.print("\n" + r2.toString());
    }
}
