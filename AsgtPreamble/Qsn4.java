import java.util.Scanner;

public class Qsn4
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double num1, num2;
        pr("\nEnter your first number :   ");
        num1 = kb.nextDouble();
        pr("\nEnter your second number :   ");
        num2 = kb.nextDouble();
        if( (0 <= num1 && num1 <=1) && (0 <= num2 && num2 <=1) )
        {
            pr("\nTrue ");
        }
        else {
            pr("\nFalse ");
        }
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}