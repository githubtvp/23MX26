import java.util.Scanner;


public class qs1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        pr("\nEnter a number : ");
        n = kb.nextInt();
        prIf(n);
        //  prSw(n);
        kb.close();
    }
    static void prIf(int n) {
        if (0 < n) {
            if (1 < n) {
                if (2 < n) {
                    if (3 < n) {
                        if (4 < n) {
                            if (5 < n) {
                                if (6 < n) {
                                    if (7 < n) {
                                        if (8 < n) {
                                            if (9 < n) {
                                                pr("\nOther greater than 9");
                                                return;
                                            } else {
                                                pr("\nNine");
                                                return;
                                            }
                                        } else {
                                            pr("\nEight");
                                            return;
                                        }
                                    } else {
                                        pr("\nSeven");
                                        return;
                                    }
                                } else {
                                    pr("\nSix");
                                    return;
                                }
                            } else {
                                pr("\nFive");
                                return;
                            }
                        } else {
                            pr("\nFour");
                            return;
                        }
                    } else {
                        pr("\nThree");
                        return;
                    }
                } else {
                    pr("\nTwo");
                    return;
                }
            } else {
                pr("\nOne");
                return;
            }

        } else if (0 == n) {
            pr("\nZero");
            return;
        } else {
            pr("\nOther less than 0");
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
