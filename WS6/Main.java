class Billing {
    double tax = 0.08;
    double totalDue;

    Billing() {
        this.totalDue = 0;
    }

   double computeBill(double pr) {
        totalDue = pr * ( 1 + tax);
        return totalDue;
    }

    double computeBill(double pr, int qty) {
        totalDue = pr*qty*(1 + pr);
        return totalDue;
    }

    double computeBill(double pr, int qty, double coup) {
        totalDue = (pr*qty-coup)*(1+tax);
        return totalDue;
    }

    void pr() {
        pr("\nShirt : Size : " + size);
        pr("\nShirt : Sleeve Size : " + slLen);
        pr("\nShirt : Material : " + mtrl);
    }

    void prn()
    {
        pr("\n");
    }
    void pr(String msg) {
        System.out.print(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Shirt s1 = new Shirt(40.5, 126.3, "Cotton");
        Shirt s2 = new Shirt(35.5, 120.3, "Polyster");
        Shirt s3 = new Shirt(45.5, 136.3, "TerryWool");
        s1.pr();
        pr();
        s2.pr();
        pr();
        s3.pr();
        // pr("Shirt created");
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
    static void pr()
    {
        pr("\n");
    }
}


