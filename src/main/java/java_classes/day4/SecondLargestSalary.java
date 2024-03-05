package java_classes.day4;

public class SecondLargestSalary {
    public static void main(String[] args) {
        int[] Salaries = {10000, 20000, 30000} ;
        int Largest = 0;
        int SecondLargest = 0;
        for (int CurrentSalary : Salaries) {
            if (CurrentSalary > Largest){
                SecondLargest = Largest;
                Largest = CurrentSalary;

            } else if (CurrentSalary > SecondLargest && CurrentSalary != Largest) {
                SecondLargest = CurrentSalary;
            }
            System.out.println(SecondLargest);


        }

    }
}
