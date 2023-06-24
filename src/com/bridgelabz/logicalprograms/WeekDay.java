package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class WeekDay {
    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        int dayOfWeek = dayOfWeek(month, day, year);
        System.out.println("Day of the week: " + dayOfWeek);
    }
}
