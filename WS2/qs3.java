public class qs3 {
    public static void main(String[] args) {
        int n1, n2, n3;
        if (args.length > 0) {
            String input = args[0];
            // Check if the input is a valid integer
            if (isValidInteger(input)) {
                int intValue = Integer.parseInt(input);
                System.out.println("Integer value: " + intValue);
            } else {
                System.out.println("Invalid input: Not an integer");
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
        n1 = getInt(args[0]);
        pr("\nInt n1 : " + n1);
        n2 = getInt(args[1]);
        pr("\nInt n2 : " + n2);
        n3 = getInt(args[2]);
        pr("\nInt n3 : " + n3);
        comp(n1, n2, n3);
    }

    //   public class CommandLineInputExample {
//        public static void main(String[] args) {
//            if (args.length > 0) {
//                String input = args[0];
//                // Check if the input is a valid integer
//                if (isValidInteger(input)) {
//                    int intValue = Integer.parseInt(input);
//                    System.out.println("Integer value: " + intValue);
//                } else {
//                    System.out.println("Invalid input: Not an integer");
//                }
//            } else {
//                System.out.println("No command-line arguments provided.");
//            }
//        }

    // Method to check if a string is a valid integer
    private static boolean isValidInteger(String str) {
        try {
            // Attempt to parse the string as an integer
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            // If parsing fails, it's not a valid integer
            return false;
        }
    }
    //  }

    static void comp(int n1, int n2, int n3) {
        if (n1 == n2 && n1 == n3)
            pr("\nThey are equal");
        else {
            pr("\nNot equal");
        }
    }

    static int getInt(String str) {
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

    static void pr(String msg) {
        System.out.print(msg);
    }
}
