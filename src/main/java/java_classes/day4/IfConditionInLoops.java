package java_classes.day4;

public class IfConditionInLoops {
    public static void main(String[] args) {
        int a, b;
        for (a = 1; a<=20; a++){
            if (a % 2 == 0) {
                System.out.println(a + " is divided by 2");
            }else if (a % 2 != 0) {
                System.out.println(a+ " is not divided by 2");

            }


        }
    }
}
