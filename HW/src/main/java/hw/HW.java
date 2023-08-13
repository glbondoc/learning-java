
package hw;

import java.util.Scanner;
public class HW {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Enter symbol: ");
        char symbol = scan.next().charAt(0);
        System.out.println("Enter second number: ");
        int secondNum = scan.nextInt();

        if (symbol == '+') {
            System.out.println(add(firstNum, secondNum));
        } else if (symbol == '-') {
            System.out.println(subtract(firstNum, secondNum));
        } else if (symbol == '*') {
            System.out.println(multiply(firstNum, secondNum));
        } else if (symbol == '/') {
            System.out.println(divide(firstNum, secondNum));
        } else {
            System.out.println("Invalid symbol.");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
    }

