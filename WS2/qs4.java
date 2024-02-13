import java.util.Scanner;


public class qs4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
//        pr("\nEnter the wind speed : ");
//        n = kb.nextInt();
        prIf(n);
        //  prSw(n);
        kb.close();
    }

    static int getInt(String str)
    {
        int intVal = 0;
        // Convert string to int
        try {
            intVal = Integer.parseInt(str);
            //pr("\nConverted int value : " + intVal + "\n");
        } catch (NumberFormatException e) {
            pr("\nError: Unable to convert the string to int. Invalid format.");
        }
        return intVal;
    }
    static void prIf(int n) {
        if (n > 95) {
            if (n > 110) {
                if (n > 130) {
                    if (n > 155) {
                        pr("\nHurricane : Category 5");
                        return;
                    } else {
                        pr("\nHurricane : Category 4");
                        return;
                    }
                } else {
                    pr("\nHurricane : Category 3");
                    return;
                }
            } else {
                pr("\nHurricane : Category 2");
                return;
            }

        } else if (n >= 74) {
            pr("\nHurricane : Category 1");
            return;
        } else {
            pr("\nNot a Hurricane");
            return;
        }
    }

    static void prSw(int n) {
        switch (n) {
            case 0:
                pr("\nZero");
                break;
            case 1:
                pr("\nOne");
                break;
            case 2:
                pr("\nTwo");
                break;
            case 3:
                pr("\nThree");
                break;
            case 4:
                pr("\nFour");
                break;
            case 5:
                pr("\nFive");
                break;
            case 6:
                pr("\nSix");
                break;
            case 7:
                pr("\nSeven");
                break;
            case 8:
                pr("\nEight");
                break;
            case 9:
                pr("\nNine");
                break;
            default:
                pr("\nOther");
                break;
        }

    }

    static void pr(String msg) {
        System.out.print(msg);
    }
}
