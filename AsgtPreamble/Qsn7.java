import java.util.Scanner;

public class Qsn7
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double num1, num2;
        pr("\nEnter your first number :   ");
        num1 = kb.nextDouble();
        pr("\nEnter your second number :   ");
        num2 = kb.nextDouble();
        if( isSameNum(num1, num2) )
        {
            pr("\nTrue ");
        }
        else {
            pr("\nFalse ");
        }
    }
    static boolean isSameNum(double num1, double num2)
    {
        return (num1 == num2);
    }

    static void pr(String msg)
    {
        System.out.print(msg);
    }
}