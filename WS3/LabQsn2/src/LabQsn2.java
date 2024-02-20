import java.util.Scanner;

public class LabQsn2 {
     public static void main(String[] args)
    {
        Scanner kb = new Scanner((System.in));
        char cont = 'Y';
        while(cont == 'Y')
        {
            pr("\nFirst point :");
            pr("\nEnter x1 : ");
            double x1 = kb.nextDouble();
            pr("\nEnter y1 : ");
            double y1 = kb.nextDouble();

            pr("\nSecond point :");
            pr("\nEnter x2 : ");
            double x2 = kb.nextDouble();
            pr("\nEnter y2 : ");
            double y2 = kb.nextDouble();
            double dist = getDist(x1, y1, x2, y2);
            pr("\nDistance between two points : " + dist);
            String s;
            kb.nextLine();
            pr("\nDo you want to continue Enter Y/N/y/n  :");
            s = kb.nextLine();
            s= s.toUpperCase();
            cont = s.charAt(0);
        }
    }

    static double getDist(double x1, double y1, double x2, double y2)
    {
        double dist = 0;
        double x = Math.pow((x1-x2),2) ;
        pr("\n x sq : " + x);
        double y = Math.pow( (y1-y2),2);
        pr("\n y sq : " + y);
        dist = Math.sqrt(x+y);
        pr("\n Area sq : " + dist);
        return dist;
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
    static void pr()
    {
        pr("\n");
    }
}