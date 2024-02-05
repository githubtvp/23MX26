package Asgt1;

import java.util.Scanner;
//import java.io.*;

public class Qsn4 {
    public static final int M5FT = 106;
    public static final int W5FT = 100;
    public static final int MINCH = 7;
    public static final int WINCH = 6;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int mf, ft, in;
        int wt;
        pr("\nEnter 1 if male or 2 if Female : ");
        mf = kb.nextInt();

        pr("\nHow tall are you , Enter how many feet first :  ");
        ft = kb.nextInt();

        pr("\nEnter how many inches :  ");
        in = kb.nextInt();
        in +=12 *(ft-5);
        if(1==mf)
        {
            wt = M5FT + in * MINCH;
        }
        else {
            wt = W5FT + in * WINCH;
        }
        pr("\nNumber of feet   : " + ft);
        pr("\nNumber of inches   : " + in);
        pr("\nYou should weigh " + wt + " pounds");
    }
    static void pr(String msg) {
        System.out.print(msg);
    }
}
