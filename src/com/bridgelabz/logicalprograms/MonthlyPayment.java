package practicepackage;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount(Principal) in Rs: ");
        int P = scanner.nextInt();
        System.out.print("Enter the years: ");
        int Y = scanner.nextInt();
        System.out.print("Enter the interest rate(%): ");
        int R = scanner.nextInt();

        double n=12 * Y;    //provided n=12*y;   n=total no.of payments
        System.out.println("n:"+n);
        double r = (R/(12.0 *100.0));//r=monthly interest rate      r=R/12*100;
        System.out.println("r:"+r);
        double payment = ((P * r) / (1 - Math.pow((1 +r),(-n))));
        System.out.println("Monthly payment is:"+payment);
    }
}
