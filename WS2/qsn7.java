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
<<<<<<< HEAD
        public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
            int sz = 10;
            int q, p;
            ArrayList<QandR> arr= new ArrayList<QandR>();
           pr("\nEnter q value : ");
           q = kb.nextInt();
           pr("\nEnter p value : ");
           p = kb.nextInt();
         //  pr("\nQ : " + q + " R : " + p);
           int q1 = q/p;
           int r1 = q%p;
           QandR pr = new QandR(q1,r1);
            arr.add(pr);
          //  pr("\nOutside While oth element : Qarr : " + arr.get(0).getQ() + " Rarr : " + arr.get(0).getR());
          //  pr("\nArr length : " + arr.size());
            q = 10*r1;
           boolean notFound = true;
           while(notFound)
           {
               q1 = q/p;
               r1 = q%p;
               notFound = appendArr(q1, r1, arr, arr.size());
               if(notFound)
               {
                   q = 10*r1;
               }
           }
           pr("0.(");
            for(int i = 0; i <arr.size(); i++) {
                 pr("" + arr.get(i).getQ());
                }
            pr(")");
         //   pr("\nCompiled!");
    }
    static boolean appendArr(int q, int r, ArrayList<QandR> qr1, int sz)
    {
       // pr("\nAppendArr : Qarr : " + qr1.get(0).getQ() + " Rarr : " + qr1.get(0).getR());
        QandR qr2 = new QandR(q,r);
        boolean notFound = true;
        for(int i = 0; i < sz; i++) {
            if ( (qr2.getQ() == qr1.get(i).getQ() ) &&  (qr2.getR() == qr1.get(i).getR()) ){
                notFound = false;
=======

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
>>>>>>> 5d007ef56cbd1477c22c22a4b28b546be853d8ea
            }
        }
        qr1.add(qr2);
        return notFound;
    }

<<<<<<< HEAD
    static void pr(String msg)
    {
        System.out.print(msg);
=======
    static void pr(String msg) {
        System.out.println(msg);
>>>>>>> 5d007ef56cbd1477c22c22a4b28b546be853d8ea
    }
}
