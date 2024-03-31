import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Student {
    String emailid;
    String rollno;
    int score;

    Student() {

    }

    Student(String email, String rno, int scr) {
        emailid = email;
        rollno = rno;
        score = scr;
    }

}

// Java program that demonstrates the use of throw
class ThrowExcep {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Student st1 = new Student();
        String emailId;
        while (true) {
            pr("\nEnter your email id : ");
            emailId = kb.nextLine();
            try {
                if (isValidEmailByRegEx(emailId)) {
                    pr("Valid email address: " + emailId);
                    break; // Exit the loop if a valid email is entered
                } else {
                    throw new Exception("Invalid EmailId");
                }
            } catch (Exception e) {
                pr("Invalid email address. Please try again.");
            }
        }

        pr("\nEnter your roll number : ");
        String rollno = kb.nextLine();
        pr(rollno);
        int score;
        while(true)
        {
            pr("\nEnter the usefulness score(>=0) : ");
            score = kb.nextInt();
            try {
                if(score >= 0)
                {
                    pr("" + score);
                    break;
                }
                else {
                    throw new Exception("Invalid Score");
                }
            } catch(Exception e) {
                e.printStackTrace();
                pr("Invalid score. Please try again.");

            }
        }
        //pr("\nHello");
        kb.close();
    } //End - psvm()
    static boolean isValidEmailByRegEx(String email) {
        // Regular expression for email validation
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher with the input email
        Matcher matcher = pattern.matcher(email);

        // Return true if the email matches the regex pattern, false otherwise
        return matcher.matches();
    }

//    static boolean isValidEmail(String email) {
//        // Check if email contains only one '@'
//        int atIndex = email.indexOf("@");
//        if (atIndex != -1 && atIndex == email.lastIndexOf("@")) {
//            // Check if email contains '.' after '@'
//            int dotIndex = email.indexOf(".", atIndex);
//            if (dotIndex != -1 && dotIndex > atIndex + 1) {
//                return true;
//            }
//        }
//        return false;
//    }
    static void pr(String msg) {
        System.out.println(msg);
    }
}
