package exercise4;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayOutput {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   
           
        System.out.println("Enter the size of the array: ");
          int size = input.nextInt();
        System.out.println("Enter the numbers: ");
         int[] numbers;
         String space = " ";

        for (int index = 0; index < numbers.length; index++) {

            numbers[index] = input.nextInt();

            for(int i = 0;i < numbers.length;i++){
                System.out.println(numbers[index]);
                System.out.print(space);
                
            }
        }
 
        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);
    }
 
}