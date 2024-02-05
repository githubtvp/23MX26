import java.util.Scanner;

public class Qsn8
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1;
        pr("\nEnter the hours in integer :   ");
        num1 = kb.nextInt();
        pr("\nThe hours in seconds is :   " + convert(num1));
    }

    static double convert(int hrs)
    {
        return (hrs * 60.0 * 60.0);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}