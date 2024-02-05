package Asgt1;

import java.util.Scanner;


public class Qsn2 {
    public static final String W = "You Win";
    public static final String L = "You Lose";

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double num1, num2, num3;
        pr("\nEnter your first number :   ");
        num1 = kb.nextDouble();
        pr("\nEnter your second number :   ");
        num2 = kb.nextDouble();
        while(num2 < num1)
        {
            pr("\nFirst number : " + num2 + "\nSecond number : " + num2 + "\nEnter valid second number :   ");
            num2 = kb.nextDouble();
        }
        pr("\nEnter your third number :   ");
        num3 = kb.nextDouble();
        pr(playGame(num1, num2, num3) );
    }

    static String playGame(double n1, double n2, double n3) {
        String res = L;
        if(n1 <= n3 && n3 <= n2)
        {
            res = W;
        }
        return res;
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
}
