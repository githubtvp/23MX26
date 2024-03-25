class Bill {
    double tax = 0.08;
    double totalDue;

    Bill() {
        this.totalDue = 0;
    }

   double computeBill(double pr) {
        totalDue = pr * ( 1 + tax);
        return totalDue;
    }

    double computeBill(double pr, int qty) {
        totalDue = pr*qty*(1 + tax);
        return totalDue;
    }

    double computeBill(double pr, int qty, double coup) {
        totalDue = (pr*qty-coup)*(1+tax);
        return totalDue;
    }

    boolean larger(Bill b2)
    {
       return (this.totalDue > b2.totalDue);
    }
    void pr() {
        pr("\nTotal Bill : " + totalDue);
    }
    void pr(String msg) {
        System.out.print(msg);
    }
}

public class Billing {
    public static void main(String[] args) {
        Bill b1 = new Bill();
        b1.computeBill(100);
        b1.pr();
        Bill b2 = new Bill();
        b2.computeBill(100, 2);
        b2.pr();
        Bill b3 = new Bill();
        b3.computeBill(100, 2, 22);
        b3.pr();
        compare (b1, b2);
    }

    static void compare (Bill b1, Bill b2)
    {
        if(b1.larger(b2))
        {
            pr("\nB1 is larger than B2 ");
        }
        else {
            pr("\nB2 is larger than B1 ");
        }
    }
    static void pr(String msg) {
        System.out.print(msg);
    }
    static void pr()
    {
        pr("\n");
    }
}


