package Asgt1;

import java.util.Scanner;

public class Qsn1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double num1, num2;
        pr("\nEnter your first number :   ");
        num1 = kb.nextDouble();
        pr("\nEnter your second number :   ");
        num2 = kb.nextDouble();
        pr(sumOk(num1, num2) ? "True" : "False");
    }

    static boolean sumOk(double n1, double n2) {
        return (n1 + n2 < 100);
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
}
