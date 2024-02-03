package java_classes.day4;

public class PrintingStarsNestedLoop {
    public static void main(String[] args) {
        int a,b;
        for (a = 1; a <= 5; a++){
            for (b = 1; b <= a; b++)
                System.out.print("*");
            System.out.println();
        }
    }
}
