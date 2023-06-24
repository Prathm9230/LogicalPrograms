package practicepackage;
import java.util.Scanner;

public class SqrtFun{
    public static double epsilon = 1e-15;
    public static double sqrt(double c){
        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (((c / t )+ t) / 2.0);  // replace t by avg value of (c/t)and(t)
        }
        return t;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Non-negative number: ");
        double num = sc.nextDouble();

        SqrtFun sq = new SqrtFun();//passing 'num' as args
        double Ans = sq.sqrt(num);
        System.out.print(Ans);
    }
}
