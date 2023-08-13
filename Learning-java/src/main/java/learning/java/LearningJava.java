/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package learning.java;

/**
 *
 * @author genrei
 */
import java.util.Scanner;
public class LearningJava {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        
        System.out.println("Enter first number: ");
        int firstnum= scan.nextInt ();
        System.out.println("Enter symbol: ");
        char symbol= scan.next().charAt (0);
        System.out.println("Enter second number: ");
        int secondnum= scan.nextInt ();
        
        add(firstnum, secondnum, symbol);     
        if (symbol == '-') {
            System.out.println(firstnum-secondnum);
        }
        if (symbol == '*'){
            System.out.println(firstnum*secondnum);
        }
        if (symbol == '/') {
            System.out.println(firstnum/secondnum);
        }
    }
    
    public static void add(int x, int y, char c) {
        if (c == '+') {
            System.out.println(x + y);
        }
    }
}

// 1. convert - * / to separate functions
// 2. move if statements into functions