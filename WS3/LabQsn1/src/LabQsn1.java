import java.util.Scanner;
import java.util.Random;

public class LabQsn1 {
    private static final char[] SPL = { '!', '@', '$', '%', '&', '+', '(', ')', '#', '?'};
    private static final char[] INT = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

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
        minLen = 8; splCh = 2; minNos = 2;
        genPwd(minLen, splCh, minNos);
       // pr("Hello world!");
    }

    static void genPwd(int len, int splCh, int nos)
    {
        char[] pwd = new char[len];
        int l = 0;
        int i = 0;
       // char[] spChArr = new char[splCh];
        int charCnt = 0; int intCnt = 0;
        while(i < len)
        {
            int chT = getRandNo(3);
            if(0==chT && charCnt < splCh )
            {
               // int chRno = getRandNo(splCh);
                int chRno = getRandNo(100)%10;
                pwd[i] = SPL[chRno];
                pr(" \n The Char  : " + chT + "  " + charCnt);
                charCnt++;
            }
            else if( 1== chT &&  intCnt < nos )
            {
                int inRno = getRandNo(nos);
              //  pr(" \n THE No : " + (intNosArr[inRno]));
                pr(" \n The Int  : " + chT + "  " + intCnt);

                pwd[i] = INT[inRno];
                intCnt++;
            }
            else {
                int num = getRandNo(26) + 97;
              //  pr("\n The Rand num : " + num);
                char alp = (char) num;
                pwd[i] = alp; //INT[inRno];
             //   pr(" \n The Other  : " + chT + " " + num);
            }
            i++;
        }
        pr();
        for (i = 0; i < pwd.length; i++)
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