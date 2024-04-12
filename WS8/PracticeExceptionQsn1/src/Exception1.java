import java.util.*;


public class Exception1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        do {

            System.out.println("Enter a number between 1 and 10");
            try{
                num = scan.nextInt();
            }
            catch(InputMismatchException e)
            {
                pr("Enter whole numbers only, with no spaces or other characters");
                break;
            }
            if (num < 1 || num > 10)
                System.out.println("\nIllegal value, " + num + " entered.  Please try again.");
        }  while (num < 1 || num > 10);

        System.out.println("\nValue correctly entered! Thank you.");

    }

    static void pr(String msg)
    {
        System.out.println(msg);
    }

}
