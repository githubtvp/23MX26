import java.util.*;


// Define the MyException class
class MyException extends Exception {
    // Parameterized constructor
    public MyException(String message) {
        // Call the constructor of the superclass (Exception) with the provided message
        super(message);
    }
    public MyException(int n) {
        // Call the constructor of the superclass (Exception) with the provided message
        super();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = 0;
        String s = "Teststr";
        while (true) {
            pr("Enter a integer value less than 11, 0 to exit loop : ");
            try {
                n = kb.nextInt();
                n = n / (n - 1);
                pr("Char at : " + n + " is" + s.charAt(n));
                if (n > 10) {
                    throw new MyException(n);
                }

            } catch (NumberFormatException e) {
                pr("Format mismatch!");
            } catch (ArithmeticException e) {
                pr("Invalid division!");
            } catch (StringIndexOutOfBoundsException e) {
                pr("Index is invalid!");
            } catch (ArrayIndexOutOfBoundsException e) {
                pr("Array index is invalid!");
            } catch (MyException e) {
                pr("MyException[" + e + "]");
            } finally {
                pr("Exception handling completed!");
            }
            if (n == 0) {
                break;
            }
        }
    }
    static void pr(String msg)
    {
        System.out.println(msg);
    }
}