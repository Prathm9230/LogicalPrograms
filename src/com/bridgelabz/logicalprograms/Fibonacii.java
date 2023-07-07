package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int next, num, a = 0, b = 1;
        System.out.println("Enter the number of Iteration: ");
        num = scanner.nextInt();
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < num-2; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.print(next + " ");

        }
    }
}
