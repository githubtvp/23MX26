
import java.util.*;
public class QsnAll {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        pr("\nLength is : " + sb.length());

        String hannah = "Did Hannah see bees? Hannah did.";
        pr("\nHannah length is : " + hannah.length());
        pr("\nCharacter at hannah.charAt(12) : " + hannah.charAt(12));
        pr("\nCharacter b is at hannah.charAt(15) : " + hannah.charAt(15));

        String str = "Was it a cbrr or a cat I saw?";
        pr("\n" + str.substring(9, 12));
        pr("\nThe sub string Len is : " + str.substring(9, 12).length());
//-------------------------------------------------------------------------------------
        	        String original = "software";
        	        StringBuilder result = new StringBuilder("hi");
        	        int index = original.indexOf('a');//first occurance
        pr("\nIndex1 : " + index);

        pr("\nIndex 2: " + ((original.substring(index + 1,original.length()-1)).indexOf('a') + index + 1));
        	/*1*/   result.setCharAt(0, original.charAt(0));
        	/*2*/   result.setCharAt(1, original.charAt(original.length()-1));//se
        	/*3*/   result.insert(1, original.charAt(4));//swe
        	/*4*/   result.append(original.substring(1,4));//sweoft
        	/*5*/   result.insert(3, (original.substring(index, index+2) + " "));//swear oft
//
        //  System.out.println(result);
            pr("\n"+ result);
    pr();
        	String hi = "Hi, ";
        	String mom = "mom.";
            pr(hi + " " + mom);

            StringBuilder strB = new StringBuilder(hi);
            strB.append(" " + mom);
            pr("\n" + strB);
            String name = "T Varadharajaperumal";
            String[] parts = name.split(" ");
            char init = parts[1].charAt(0);
            pr("\nMy initial : " + init);
            String s1 = "parliament";
            String s2 = "partial men";
        String s1N = s1.replace(" ", "");
        String s2N = s2.replace(" ", "");
        pr("\n" + s1N);
        pr("\n" + s2N);
        if(s1N.length()!=s2N.length())
        {
            pr("\nNot annagram");
        }
        else {

        }


    }

    static void pr(String msg) {
        System.out.print(msg);
    }

    static void pr() {
        pr("\n");
    }
}
