class Butterfly
{
    String color;
    String eating;
    String fighting;
    String movement;

    public Butterfly(String color, String eating, String fighting) {
        this.color = color;
        this.eating = eating;
        this.fighting = fighting;
    }
    public Butterfly() {
        this.color = "Color.YELLOW";
        this.eating = "Never eats";
        this.fighting = "Always forfeits";
    }

    String toString()
    {
        return ("\nAlternates between ")
    }
}


public class Main {
    public static void main(String[] args)
    {
        Butterfly bf = new Butterfly();

        System.out.println("Hello world!");
    }
}