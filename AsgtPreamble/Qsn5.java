import java.util.Scanner;

public class Qsn5
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1;
        pr("\nEnter the minutes in integer :   ");
        num1 = kb.nextInt();
        pr("\nThe minutes in seconds is :   " + convert(num1));
    }

    static double convert(int min)
    {
        return (min * 60.0);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}