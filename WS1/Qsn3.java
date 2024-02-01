package Asgt1;

import java.util.Scanner;
//import java.io.*;

public class Qsn3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // Declaring array literal
       // int[] intArray = new int[]{175, 167, 160, 183, 187, 188, 179, 176, 175, 169,
      // 175, 176, 178, 165, 160, 173, 165, 187, 178};
        int sz, mks[];
        pr("\nEnter no of students :   ");


        sz = 20;
        mks = new int[]{175, 167, 160, 164, 183, 187, 188, 179, 176, 175,
                169, 175, 176, 178, 165, 160, 173, 165, 187, 178};
        //  sz = kb.nextInt();
        //  mks = new int[sz];
        //  getStudMarks(mks, sz);
        sortArray(mks, sz);
        prMarks(mks, sz);
        pr("\n");
        int[] mks2 = new int[sz];
        int[] freq = new int[sz];
        countMksFreq(mks, mks2, freq, sz);
        pr("\n");
      //  prMarks(mks2, sz);
        pr("\n");
        //prMarks(freq, sz);
        prTable(mks2, freq, sz);
    }

    static void countMksFreq(int[] arr, int[] arr2, int[] freq, int sz) {
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
    }

    static void sortArray(int[] arr, int sz) {
        for (int i = 0; i < sz - 1; i++) {
            int indx = i;
            for (int j = i + 1; j < sz; j++) {
                if (arr[indx] > arr[j])
                    indx = j;
            }
            if (indx != i) {
                int temp;
                temp = arr[indx];
                arr[indx] = arr[i];
                arr[i] = temp;
            }
        }
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

    static void prTable(int[] mks, int[] freq, int sz) {
        pr("\nHeight \t\t Number of Students\n");
        for (int i = 0; i < sz; i++) {
            if(freq[i] !=0) {
                pr(mks[i] + "\t\t\t\t" + freq[i] + "\n");
            }
        }
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
