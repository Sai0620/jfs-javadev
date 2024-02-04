package java_classes.day4;

public class SwappingXandY {
    public static void main(String[] args) {
        int x,y,temp;
        x = 12;
        y = 56;

        temp = x;
        x = y;
        y = temp;
        System.out.println("value of x: " + x);
        System.out.println("value of y: " +y);
    }
}
