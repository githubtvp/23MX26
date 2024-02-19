import java.util.*;
import java.util.Scanner;
public class Qsn4 {
    public static void main(String[] args) {
        int sum =0;
        int n= 20;
        pr("\nSum = " + sumUpToN(n));
       // pr("\nHello W");
    }

    static int sumUpToN(int n)
    {
        int sum = 0;
        for(int j = n; j >0; j--)
        {
            for(int i = j; i >0; i--)
            {
                sum+=i;
            }
        }
        return sum;
    }
    static void pr(String msg) {
        System.out.print(msg);
    }

    static void pr() {
        pr("\n");
    }
}

