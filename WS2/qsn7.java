import java.util.Scanner;

public class qsn7 {

    static class QandR {
        int q, r;

        QandR(int q, int r) {
            this.q = q;
            this.r = r;
        }

        int getQ() {
            return this.q;
        }

        int getR() {
            return this.r;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sz = 10;
        int q, p;
        QandR[] arr = new QandR[sz];
        pr("\nEnter q value : ");
        q = kb.nextInt();
        pr("\nEnter p value : ");
        p = kb.nextInt();
        //  pr("\nQ : " + q + " R : " + p);
        int q1 = q / p;
        int r1 = q % p;
        QandR pr = new QandR(q1, r1);
        arr[0] = pr;
        pr("\nQarr : " + arr[0].getQ() + " Rarr : " + arr[0].getR());
        q = 10 * r1;
        boolean notFound = true;
        while (notFound) {
            q1 = q / p;
            r1 = q % p;
            notFound = appendArr(q1, r1, arr, arr.length);
            if (notFound) {
                q = 10 * r1;
            }
        }
        //     pr("Compiled!");
    }

    static boolean appendArr(int q, int r, QandR[] qr, int sz) {
        QandR pr = new QandR(q, r);
        for (int i = 0; i < sz; i++) {
            if (pr.getQ() == qr[i].getQ() && pr.getR() == qr[i].getR()) {
                return false;
            }
        }
        qr[sz] = pr;
        return true;
    }

    static void pr(String msg) {
        System.out.println(msg);
    }
}
