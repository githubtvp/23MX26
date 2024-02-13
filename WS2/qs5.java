public class qs5 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5, n6;
        n1 = getDouble(args[0]);
        pr("\nDbl n1 : " + n1);
        n2 = getDouble(args[1]);
        pr("\nDbl n2 : " + n2);
        n3 = getDouble(args[2]);
        pr("\nDbl n3 : " + n3);
        n4 = getDouble(args[3]);
        pr("\nDbl n4 : " + n4);
        n5 = getDouble(args[4]);
        pr("\nDbl n5 : " + n5);
        n6 = getDouble(args[5]);
        pr("\nDbl n6 : " + n6);
        computeAvg(n2, n3, n4, n5);
    }

    static void computeAvg(double n1, double n2, double n3, double n4)
    {
            double avg = (n1 + n2 + n3 + n4)/4.0;
            pr("\nAverage score : " + avg);
    }
    static double getDouble(String str)
    {
        double dblVal = 0.0;
        // Convert string to int
        try {
            dblVal = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            pr("\nError: Unable to convert the string to int. Invalid format.");
        }
        return dblVal;
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}
