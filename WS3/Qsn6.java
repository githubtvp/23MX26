import java.util.Arrays;
import java.util.Scanner;

public class Qsn6 {

    static int indxK = 0;
    static int indxJ = 0;

    public static void main(String[] args) {
        int n = 7;
        Scanner kb = new Scanner((System.in));
        pr("\nEnter the array size ");
        int sz = kb.nextInt();
        int[] arr = new int[sz];
        int[] arr1 = new int[sz];
        int[] arr2 = new int[sz];
        getArrayEls(arr, sz);
        processArrayEls(arr, sz, arr1, arr2);
        pr("\nPrime No : ");
        prArr(arr1, indxK);
        pr();
        pr("\nComposite No : ");
        //pr(arr2);
        prArr(arr2, indxJ);
        pr();
//n + " is " + (checkPrime(n) ? "a " : "not a ") + "prime number");
        kb.close();
    }

    static void processArrayEls(int[] arr, int sz, int[] arr1, int[] arr2) {
        for (int i = 0; i < sz; i++) {
            int no = arr[i];
            if (checkPrime(no) ) {
              //  pr("\nAdd to prime " + no);
                addToPrimeArr(arr1, no);
            }
            else {   // pr("\nAdd to compo " + no);
                addToCompositeArr(arr2, no); }
        }
    }

    static int addToPrimeArr(int[] arr, int aNo) {
        arr[indxK] = aNo;
        indxK++;
        return 0;
    }

    static int addToCompositeArr(int[] arr, int aNo) {
        arr[indxJ] = aNo;
        indxJ++;
        return 0;
    }

    static void getArrayEls(int[] arr, int sz) {
        Scanner kb = new Scanner((System.in));
        for (int i = 0; i < sz; i++) {
            pr("\nEnter an element value : ");
            arr[i] = kb.nextInt();
        }
        pr(arr);
        pr();
        kb.close();
    }

    static boolean checkPrime(int n) {
        boolean prime = true;
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        int i = 2;
        if (n > 3) {
             while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                  //  pr("\nAdd to not prime " + n + " " + prime);
                    prime = false;
                    break;
                }
                i++;
            }
        }
        return prime;
    }

    static void pr(String msg) {
        System.out.print(msg);
    }

    static void pr() {
        pr("\n");
    }

    static void prArr(int[] arr, int sz)
    {
        pr("\n[");
        for(int i = 0; i < sz; i++)
        {
            pr("\t" + arr[i]);
        }
        pr("\t]\n");

    }
    static void pr(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }
}

