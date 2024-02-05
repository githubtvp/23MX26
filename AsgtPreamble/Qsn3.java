import java.util.Scanner;

public class Qsn3
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double ht, wt, bmi;
        String gen;
        char g;
        pr("\nEnter your height in meters :   ");
        ht = kb.nextDouble();
        pr("\nEnter your weight in kgs :   ");
        wt = kb.nextDouble();
        kb.nextLine();//consume the next char
        pr("\nEnter your gender :   ");
        gen = kb.nextLine();
        gen = gen.toUpperCase();
        g = gen.charAt(0);
        bmi = wt / (ht * ht);
        pr("\nBMI value : " + bmi);
        if( (g == 'M' && bmi  >=2.78) || (g == 'F' && bmi >= 2.5) )
        {
            pr("\nYou are obeese ");
        }
        else {
            pr("\nYou are Not obeese ");
        }
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}