// 2)  To implement a program to validate the String containing:
// An uppercase letter A-Z
// A lowercase letter a-z
// A digit 0-9
// A character from [#?!@$%^&*-_]

// means overall find a string which conatain - atleast 1 Upper charater
//                                            - atleast 1 lower character
//                                            - atleast 1 character (0-9)
//                                            - atleast 1 special character (@ , # < $)
    
import java.util.Scanner;
public class StringValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper = true;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                lower = true;
            } 
            else if (ch >= '0' && ch <= '9') {
                digit = true;
            } 
            else if ("#?!@$%^&*-_".indexOf(ch) != -1) {
                special = true;
            }
        }

        if (upper && lower && digit && special) {
            System.out.println("Valid String!");
        } else {
            System.out.println("Invalid String!");
        }

        sc.close();
    }
}
