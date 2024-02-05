import java.util.Scanner;

public class Qsn9
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double len, wid;
        pr("\nEnter length :   ");
        len = kb.nextDouble();
        pr("\nEnter width :   ");
        wid = kb.nextDouble();
        pr("\nThe perimeter is :   " + getPerimeter(len, wid) );
    }

    static double getPerimeter(double len, double wid)
    {
        return (2 * (len + wid) );
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}