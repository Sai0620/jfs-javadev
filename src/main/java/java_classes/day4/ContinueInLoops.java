package java_classes.day4;

public class ContinueInLoops {
    public static void main(String[] args) {
        int a;
        for(a = 1; a <=10; a++){
            if (a % 2 != 0)
                continue;
                System.out.println(a + " even number");
        }
    }
}
