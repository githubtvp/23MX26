import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final char[] SPL = { '!', '@', '$', '%', '&', '+', '(', ')', '#', '?'};

    public static void main(String[] args)
    {
        Scanner kb = new Scanner((System.in));
        /*
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        */
        int minLen = 0, minNos = 0, splCh = 0, pwdCnt = 0;
        pr("\nEnter how many minimum characters required in password : ");
       // minLen = kb.nextInt();
        pr("\nEnter how many special characters required in password : ");
       // splCh = kb.nextInt();
        pr("\nEnter how many numbers required in password : ");
       // minNos = kb.nextInt();
        pr("\nEnter how many passwords required : ");
      //  pwdCnt = kb.nextInt();
        minLen = 4; splCh = 2; minNos = 2;
        genPwd(minLen, splCh, minNos);
       // pr("Hello world!");
    }

    static void genPwd(int len, int splCh, int nos)
    {
        char[] pwd = new char[len];

        int l = 0;
        char[] spChArr = new char[splCh];
        while(l < splCh)
        {
            int n = getRandNo(10);
            spChArr[l] = SPL[n];
            pr("\nChar :  " + SPL[n]);
            l++;
        }
        l= 0;
        int[] intNosArr = new int[nos];
        while(l < nos)
        {
            int n = getRandNo(10);
            pr("\nInt :  " + n);
            intNosArr[l] = n;
            l++;
        }

        int totSplNos = splCh + nos;
        int c= 0;
        while(c < totSplNos)
        {
            int charCnt = 0; int intCnt = 0;
            int ch = getRandNo(2);
            if(0==ch && charCnt < splCh )
            {
                int chRno = getRandNo(splCh);
                pwd[c] = spChArr[chRno];
                charCnt++;
            }
            else if( 1== ch &&  intCnt < nos )
            {
                int inRno = getRandNo(nos);
                pr(" \n THE No : " + (intNosArr[inRno]));
                pwd[c] = (char)(intNosArr[inRno]);
                intCnt++;
            }
            c++;
        }
        pr();
        for (int i = 0; i < pwd.length; i++)
        {
            pr("" + pwd[i]);
        }
    }
    static int getRandNo(int rng)
    {
        int randNo = 0;
        Random rand = new Random();
        randNo = rand.nextInt(rng);
     ///   pr("\n Rand No : " + randNo);
        return randNo;
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }

    static void pr()
    {
        pr("\n");
    }
}