package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not perfect number.");
        }
    }

}
