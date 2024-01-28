import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        a = input.nextDouble();
        System.out.println("enter second number:");
        b = input.nextDouble();
        System.out.println("enter third number: ");
        c = input.nextDouble();
        input.close();

        if (a > b && a > c){
            System.out.println("a is greater ");
        } else if (b > c) {
            System.out.println("b is greater ");

        }else {
            System.out.println("c is greater ");
        }
    }
}
