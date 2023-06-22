package com.bridgelabz.logicalprograms;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int i=2;
        while(i<num)
        {
                if(num % i==0)
                {
                System.out.println("It is not prime number;");
                break;
                }
            else
            {
                System.out.println("It's prime number.");
                break;
            }

        }

    }
}
