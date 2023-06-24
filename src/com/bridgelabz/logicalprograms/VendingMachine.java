package practicepackage;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in Rs: ");
        int amount = scanner.nextInt();
        int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
        int total = 0;
        System.out.println("No.of notes to be return: ");
        for (int i = 0; i < notes.length; i++) {
            int noteCount = amount / notes[i];
            if (noteCount > 0) {
                System.out.println("No.of notes:"+noteCount+"  "+"RS:"+notes[i]);
                total += noteCount;
                amount %= notes[i];
            }
        }
        System.out.println("Min no. of notes required: " + total);
    }
}

