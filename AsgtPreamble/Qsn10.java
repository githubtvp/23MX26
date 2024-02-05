import java.util.Scanner;

public class Qsn10
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double vol, cur;
        pr("\nEnter Voltage :   ");
        vol = kb.nextDouble();
        pr("\nEnter current :   ");
        cur = kb.nextDouble();
        pr("\nThe power is :   " + getPower(vol, cur) );
    }

    static double getPower(double v, double c)
    {
        return (v * c);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}