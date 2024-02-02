package java_classes.day4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = input.nextInt();
        do {
            System.out.println(+a+ " is not between 1 and 20; enter another number: ");
            a = input.nextInt();
        } while (a < 1 || a > 20);
        System.out.println(+a+ " is between 1 and 20");
    }
}
