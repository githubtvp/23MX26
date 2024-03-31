import java.util.*;
import java.io.*;
class BloodPressure{
    private int upper;
    private int lower;

    BloodPressure(){
        upper = 120;
        lower = 80;
    }
    BloodPressure(int x, int y)
    {
        upper = x; lower = y;
    }

    int getUpper()
    {
        return upper;
    }
    int getLower()
    {
        return lower;
    }

    void setUpper(int x)
    {
        upper = x;
    }
    void setLower(int x)
    {
        lower = x;
    }

}

class Patient extends BloodPressure{
    String name;

    Patient()
    {
        super();
    }

    Patient(String name, int x, int y)
    {
        super(x,y);
        this.name = name;
    }

    int getBP()
    {
        int cat = 0;
        int x = super.getUpper();
        int y = super.getLower();
        System.out.print("X : " + x + " Y : " + y + "\n");
        if(x < 120 && y < 80 ) return 1;
        if( (120 <= x &&  x < 130) && y < 80 ) return 2;
        if( (130 <= x &&  x < 140) && (80 <= y && y < 90) ) return 3;
        if( (140 <= x && x <= 180) || (90 <= y && y <= 120) ) return 4;
        if( (180 < x) && (120 < y) ) return 5;
        return cat;
    }
}

public class Main {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String name;
        int upper; int lower;
        pr("\nEnter name : ");
        name = kb.nextLine();
        pr("\nEnter value of Upper : ");
        upper = kb.nextInt();
        pr("\nEnter value of lower : ");
        lower = kb.nextInt();
        Patient pt1 = new Patient(name, upper, lower);
        int cat = pt1.getBP();
        switch (cat)
        {
            case 1 :
                pr("Normal");
               break;
            case 2 :
                pr("Elevated");
                break;
            case  3:
                pr("High BP Stage 1");
                break;
            case 4 :
                pr("High BP Stage 2");
                break;
            case 5 :
                pr("Hypertensive Crisis");
                break;
            default :
                break;
         }
    }
    static void pr(String msg)
    {
        System.out.println(msg);
    }
    static void pr()
    {
       // pr("\n");
        System.out.println();
    }
}