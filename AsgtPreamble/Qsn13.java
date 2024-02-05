import java.util.Scanner;

public class Qsn13
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int sz;
        pr("\nEnter number of entries :   ");
        sz = kb.nextInt();
        int arr1[] = new int[sz];
        for(int i = 0; i < sz; i++)
        {
            pr("\nEnter array element :   ");
            arr1[i] = kb.nextInt();
        }
        pr("\nThe first number in array is :   " + getEl(arr1));
    }

    static int getEl(int[] a)
    {
        return (a[0]);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}