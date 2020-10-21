package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Enter the size for the array: ");
            int size = input.nextInt();
            System.out.println("Enter the array numbers: ");
            double numbers[] = new double[size];
                for (int index = 0; index < numbers.length; index++) {

            numbers[index] = input.nextDouble();
            System.out.println("Max number: " + Math.max(numbers);
           }
        
    }

}
