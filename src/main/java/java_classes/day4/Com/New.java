package java_classes.day4.Com;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        a = input.nextInt();
        System.out.print(("Enter a number b: " ));
        b = input.nextInt();
        System.out.print("Result:");
        System.out.print(+a * +b);
    }
}
