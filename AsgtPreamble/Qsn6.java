import java.util.Scanner;

public class Qsn6
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1, num2;
        pr("\nEnter your first number :   ");
        num1 = kb.nextInt();
        pr("\nEnter your second number :   ");
        num2 = kb.nextInt();
        pr("\nSum of 2 numbers :  " + sum(num1, num2));
    }

    static int sum(int num1, int num2)
    {
        return (num1 + num2);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}