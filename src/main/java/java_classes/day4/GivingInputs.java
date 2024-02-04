package java_classes.day4;

import java.util.Scanner;

public class GivingInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a,c;
        int b;
        System.out.println("What is your name? ");
        a = input.nextLine();
        System.out.println("How old are you? ");
        b = input.nextInt();
        System.out.println("which class? ");
        int d = input.nextInt();
        System.out.println("What are your hobbies? ");
        c = input.nextLine();

        System.out.println("okay!!! Now I will give your details");
        System.out.println("My name is " + a);
        System.out.println("My age is " + b);
        System.out.println("My class is " + d);
        System.out.println("My hobbies are " + c);

    }
}