package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int r=0,ans=0,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        for(;num>0; num = num/10)
        {
            r = num % 10;
            ans= ans*10 +r;
        }
        System.out.println("reverse of given number is:"+ans);
    }
}
