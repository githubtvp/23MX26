import java.util.Scanner;

public class Qsn2
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double rad, len, area, vol;
        pr("\nEnter the radius of cylinder :   ");
        rad = kb.nextDouble();
        pr("\nEnter the length of cylinder :   ");
        len = kb.nextDouble();
        area = Math.PI * rad * rad;
        vol = area * len;
        pr("\nVolume : " + vol);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}