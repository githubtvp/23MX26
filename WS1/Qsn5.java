package Asgt1;

import java.util.Scanner;
//import java.io.*;

public class Qsn5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // Declaring array literal
        // int[] intArray = new int[]{175, 167, 160, 183, 187, 188, 179, 176, 175, 169,
        // 175, 176, 178, 165, 160, 173, 165, 187, 178};
        int sz, arr[];
        pr("\nEnter no of entries :   ");
        // sz = 20;
        // mks = new int[]{175, 167, 160, 164, 183, 187, 188, 179, 176, 175,
        //         169, 175, 176, 178, 165, 160, 173, 165, 187, 178};
        sz = kb.nextInt();
        arr = new int[sz];
        getEntries(arr, sz);
        pr("\n");
        if (decreasing(arr, sz)) {
            pr("\nDecreasing");
        } else {
            pr("\nNon Decreasing");
        }

    }

    static boolean decreasing(int[] arr, int sz) {
        boolean decr = true;
        for (int i = 0; i < sz - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                decr = false;
                break;
            }
        }
        return decr;
    }

    static void getEntries(int[] mks, int sz) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < sz; i++) {
            pr("\nEnter marks of stud " + (i + 1) + " :   ");
            mks[i] = kb.nextInt();
        }
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
}
