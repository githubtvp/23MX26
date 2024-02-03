package Asgt1;

import java.util.Scanner;
//import java.io.*;

public class Qsn3 {

    static class IntVar {
        int val;

        void set(int v) {
            val = v;
        }

        int get() {
            return val;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        IntVar iVar = new IntVar();
        int sz, mks[];
        double avg = 0;
        pr("\nEnter no of students :   ");
        sz = kb.nextInt();
        mks = new int[sz];
        //  sz = 20;
        //   mks = new int[]{175, 167, 160, 164, 183, 187, 188, 179, 176, 175,
        //           169, 175, 176, 178, 165, 160, 173, 165, 187, 178};
        getStudMarks(mks, sz);
        // pr("\nStudent total marks : " + iVar.get() + "\n");
        //  iVar.set(sz);
        sortArray(mks, sz, iVar);
        avg = (iVar.get() * 1.0) / sz;
        prMarks(mks, sz);
        pr("\nAverage : " + avg);
        int[] mks2 = new int[sz];
        int[] freq = new int[sz];
        countMksFreq(mks, mks2, freq, sz, iVar);
        pr("\n");
        //prMarks(freq, sz);
        prTable(mks2, freq, iVar.get(), avg);
    }

    static void countMksFreq(int[] arr, int[] arr2, int[] freq, int sz, IntVar iv) {
        int cnt, k;
        k = 0;
        for (int i = 0; i < sz; i++) {
            cnt = 1;
            int indx = i;
            for (int j = i + 1; j < sz; j++) {
                if (arr[indx] == arr[j]) {
                    cnt++;
                    i++;
                }
            }
            //  pr("\nAt indx : " + indx + " Count : " + cnt);
            arr2[k] = arr[indx];
            freq[k] = cnt;
            k++;
        }
        iv.set(k);
    }

    static void sortArray(int[] mks, int sz, IntVar iv) {
        int sum = 0;
        sum += mks[sz - 1];
        for (int i = 0; i < sz - 1; i++) {
            int indx = i;
            sum += mks[i];
            for (int j = i + 1; j < sz; j++) {
                if (mks[indx] > mks[j])
                    indx = j;
            }
            if (indx != i) {
                int temp;
                temp = mks[indx];
                mks[indx] = mks[i];
                mks[i] = temp;
            }
        }
        //  pr("\nSum total : " + sum);
        iv.set(sum);
    }

    static void getStudMarks(int[] mks, int sz) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < sz; i++) {
            pr("\nEnter marks of stud " + (i + 1) + " :   ");
            mks[i] = kb.nextInt();
        }

    }

    static int getMarksTotal(int[] mks, int sz) {
        Scanner kb = new Scanner(System.in);
        int tot = 0;
        for (int i = 0; i < sz; i++) {
            tot += mks[i];
        }
        return tot;
    }

    static void prTable(int[] mks, int[] freq, int sz, double avg) {
        pr("\nHeight \t\t Number of Students\n");
        for (int i = 0; i < sz; i++) {
            //  if(freq[i] !=0) {
            pr(mks[i] + "\t\t\t\t" + freq[i] + "\n");
            //  }
        }
        pr("\nAverage height :  " + avg);
    }

    static void prMarks(int[] mks, int sz) {
        for (int i = 0; i < sz; i++) {
            pr(" " + mks[i] + " ");
        }
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
}
