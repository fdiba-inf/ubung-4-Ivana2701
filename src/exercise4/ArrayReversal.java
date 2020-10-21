package exercise4;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class ArrayReversal {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");          
        int size = input.nextInt();

        System.out.println("Enter text: ");
        String text = input.next();

        char[] array = new char[0];
        int n = array.length;
    
        
        for(int i = 0; i < n; i++){
            
                  for(int m = array.length - 1; m >= 0; m--){
                  System.out.print(array[m] + " ");
                  }

       System.out.print("Reversed symbols: ");
 
      }
    }
}