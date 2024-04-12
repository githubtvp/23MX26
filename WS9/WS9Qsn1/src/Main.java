import java.util.Scanner;


class ExceptionHandling {
    public ExceptionHandling() {

    }

    public ExceptionHandling(int e) {
        prMsg(e);
    }

    void prMsg(int n) {
        System.out.print("MyException [" + n + "] : ");
        switch (n) {
            case 1: {
                System.out.print("Error: Division by zero is not allowed.");break;
            }
            case 2: {
                System.out.println("Format mismatch: Please enter valid numeric values.");break;
            }
            case 3: {
                System.out.println("Index is invalid: Please enter a valid index within the string length.");break;
            }
            case 4: {
                System.out.println("Array index is invalid: Please enter a valid index within the array size.");break;
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        pr("Please enter  how many numbers : ");
        int n = kb.nextInt();
        int i = 0;
        ExceptionHandling MyException;
        while (i < n) {
            try {
                pr("\nEnter a number : ");
                if (!kb.hasNextInt()) {
                    throw new NumberFormatException();
                }
                int m = kb.nextInt();
                kb.nextLine(); // Read the newline character after the integer
            } catch (ArithmeticException e) {
               MyException = new ExceptionHandling(1); break;
            } catch (NumberFormatException e) {
                MyException = new ExceptionHandling(2); break;
            } catch (StringIndexOutOfBoundsException e) {
                MyException = new ExceptionHandling(3); break;
            } catch (ArrayIndexOutOfBoundsException e) {
                MyException = new ExceptionHandling(4); break;
            } catch (Exception e) {
                MyException = new ExceptionHandling(5); break;
            } finally {

            }
            i++;
        }
        pr("Exception handling completed!");
        kb.close();
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    static void pr(String msg) {
        System.out.println(msg);
    }
}
