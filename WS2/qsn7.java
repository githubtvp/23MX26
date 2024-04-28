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

            }
        }
        qr1.add(qr2);
        return notFound;
    }
    static void pr(String msg)
    {
        System.out.print(msg);

    }
}
