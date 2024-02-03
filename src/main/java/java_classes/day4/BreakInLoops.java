package java_classes.day4;

import java.util.Scanner;

public class BreakInLoops {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = input.nextInt();

        while(true) {
            System.out.println(a+ " is not in between 1 and 10");
            System.out.println("enter another number:");
            a = input.nextInt();
            if (a < 1 || a > 10)
                continue;

            System.out.println(a + " is in between 1 and 10");
            break;
        }
    }
}
