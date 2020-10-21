package exercise4;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class ArrayReversal {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");          
        int arrayLenght = input.nextInt();
        int backw = arrayLenght;

        System.out.println("Enter text: ");
        String text = input.next();
       
        char[] array =  text.charAt[0];
    
    
        
        for(int i = 0; i < arrayLenght; i++){
            
                  for(int m = backw - 1; m >= 0; m--){
                  System.out.print(array[m] + " ");
                  }

       System.out.print("Reversed symbols: ");
 
      }
    }
}