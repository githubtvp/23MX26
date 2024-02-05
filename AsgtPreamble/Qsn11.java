import java.util.Scanner;

public class Qsn11
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double v;
        pr("\nEnter number :   ");
        v = kb.nextDouble();
       pr("\nThe number is :   " + getNum(v) );
    }

    static double getNum(double v)
    {
        return (v + 1);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}