package java_classes;

import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        a = input.nextFloat();
        System.out.println("enter second number: ");
        b = input.nextFloat();
        System.out.println("enter third number: ");
        c = input.nextFloat();
        input.close();

        if(a > b && a > c) {
            System.out.println(+a + " is greater");
        } else if (b > c) {
            System.out.println(+b + " is greater");
        } else {
            System.out.println(+c+ " is greater");


        }



    }
}
