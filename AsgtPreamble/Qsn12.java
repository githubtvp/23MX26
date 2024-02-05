import java.util.Scanner;

public class Qsn12
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1;
        pr("\nEnter the age in integer :   ");
        num1 = kb.nextInt();
        pr("\nThe age in days is :   " + convert(num1));
    }

    static int convert(int a)
    {
        return (a * 365);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}