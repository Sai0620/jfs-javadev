package java_classes.day4;

import java.util.Scanner;

public class OneToTwentyNum {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = input.nextInt();
        while(a < 1 || a > 20){
            System.out.print(+a+ " is not between 1 to 20; give another input: ");
            a = input.nextInt();
        }
        System.out.println(+a+" is between 1 to 20");
    }
}
