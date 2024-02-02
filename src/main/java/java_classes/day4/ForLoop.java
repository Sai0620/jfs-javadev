package java_classes.day4;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = input.nextInt();

        for ( ;a < 1 || a > 20; ){
        System.out.print(+a+" is not between 1 and 20; Enter another number: ");
        a = input.nextInt();
    }
        System.out.println(+a+ " is between 10 and 20");
    }
    }