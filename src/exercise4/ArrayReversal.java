package exercise4;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class ArrayReversal {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");          
        int size = input.nextInt();
        int backw = size;

        System.out.println("Enter text: ");

        String text = input.next();       
        char[] array =  text.toCharArray();      
                            
                  for(int m = backw - 1; m >= 0; m--){
                     String reversedAsString= array[m] + " ";                  
                  }  

     
    }
}