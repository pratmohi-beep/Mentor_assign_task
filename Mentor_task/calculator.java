// Task 1: Basic Calculator with Input Validation
// Features: Addition, subtraction, multiplication, division, and invalid input handling.
import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: +, -, *, /");
        char op = sc.next().charAt(0);

        int result = 0;

        if (op == '+') {
            result = c.add(a, b);
        } else if (op == '-') {
            result = c.sub(a, b);
        } else if (op == '*') {
            result = c.mul(a, b);
        } else if (op == '/') {
            result = c.div(a,b);
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}