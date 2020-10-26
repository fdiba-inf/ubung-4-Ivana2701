package exercise4;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayOutput {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   
           
        System.out.println("Enter the size of the array: ");
          int size = input.nextInt();
        System.out.println("Enter the numbers: ");
         int[] numbers = new int[size];
         String space = " ";

         for (int index = 0; index < numbers.length; index++) {

            numbers[index] = input.nextInt();
      }

        for (int index = 0; index < numbers.length; index++) {

            for(int i = 0;i < index;i++){
                System.out.print(space);
            }

                System.out.println(numbers[index]);
        }
 
        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);
    }
 
}