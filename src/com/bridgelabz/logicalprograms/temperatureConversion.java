package practicepackage;

import java.util.Scanner;

public class temperatureConversion {
    public void FtoC()//Fahreinhit to degree celcius conversion
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature value in F(Fahreinhit):");
        double F = sc.nextDouble();
         double temp1 =   ((F - 32) * ((double) 5 /9));//formula F to C
        System.out.println("temperature conversion from F to C:"+temp1);
    }
    public void CtoF()//Celcius to degree Fahreinhit conversion
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature value in C(celcius):");//formula C to F
        double C = sc.nextDouble();
        double temp2 =   ((C * ((double) 9 /5)) + 32);
        System.out.println("temperature conversion from F to C:"+temp2);
    }

    public static void main(String[] args) {
        //1 fahreinheit = -17.22 celcius;    1 celcius = 33.8 F;
        temperatureConversion t = new temperatureConversion();
        t.FtoC();
        t.CtoF();
    }
}
