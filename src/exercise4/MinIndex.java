package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Enter the size for the array: ");
            int n = input.nextInt();
            
            System.out.println("Enter the array numbers: ");
                int index = 0;
    float minValue = Float.MAX_VALUE;
    
    float[] array = new float[n];

    for(int i = 0; i < array.length; i++){
      array[i] = input.nextFloat();
    }

    for(int i = 0; i < array.length; i++){

      if(array[i] < minValue){
        minValue = array[i];
        index = i;
      }
    }

    System.out.println("Min index: " + index);
        
    }

}
