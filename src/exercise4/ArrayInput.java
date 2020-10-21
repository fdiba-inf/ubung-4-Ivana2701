package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayInput{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value for the array: ");
    int size = input.nextInt();
    System.out.println("Enter the array numbers: ");
    int numbers[] = new int[size];
 
    for(int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }    
    
    String numbersAsString = Arrays.toString(numbers);
     System.out.println("Numbers: " + numbersAsString);
  }
}