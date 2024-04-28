import java.lang.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    int sum = 0;
        @Override
        public int divisor_sum(int n)
        {
            for (int i = 1; i < (n/2+1); i++) {
                if (0==n%i)
                {
                    sum += i;
                    //System.out.println("\n S : " + sum);
                }
            }
            System.out.println("I implmented : AdvancedArithmetic");
            return sum + n;
        };

    public MyCalculator() {
    }
}

public class Main {
    public static void main(String[] args)
    {
        int n = 100;
        MyCalculator mc = new MyCalculator();
        int sum = mc.divisor_sum(n);
        pr("\nSum : " + sum);
    }

    static void pr(String msg){
        System.out.println(msg);
    }
}
