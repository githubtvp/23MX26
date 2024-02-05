import java.util.Scanner;
import java.io.*;

public class qs3 {
    public static void main(String[] args) {
        int n1, n2, n3;
         n1 = getInt(args[0]);
         pr("\nInt n1 : " + n1);
        n2 = getInt(args[1]);
        pr("\nInt n2 : " + n2);
        n3 = getInt(args[2]);
        pr("\nInt n3 : " + n3);
    }

    static void comp(int n1, int n2, int n3)
    {
        
    }
    static int getInt(String str)
    {
        int intVal = 0;
        // Convert string to int
        try {
            intVal = Integer.parseInt(str);
            //pr("\nConverted int value : " + intVal + "\n");
        } catch (NumberFormatException e) {
            pr("\nError: Unable to convert the string to int. Invalid format.");
        }
        return intVal;
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}
