import java.util.Scanner;

public class Qsn14
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double e1, e2;
        pr("\nEnter edge 1 :   ");
        e1 = kb.nextDouble();
        pr("\nEnter edge 2 :   ");
        e2 = kb.nextDouble();
        pr("\nThe max range of next edge is :   " + nextEdge(e1, e2) );
    }

    static double nextEdge(double e1, double e2)
    {
        return (e1 + e2 -1);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}