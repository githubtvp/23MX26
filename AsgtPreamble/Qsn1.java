import java.util.*;
import java.io.*;

public class Qsn1
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        pr("\nEnter the celsius temp :   ");
        double cel, far;
        cel = kb.nextDouble();
        pr("\nCelsius : " + cel);
        far = (9*cel)/5 + 32;
        pr("\nFarenheit : " + far);

    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}