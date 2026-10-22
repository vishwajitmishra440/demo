package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class takeInput {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array ");
        int  num = sc.nextInt();

        int[] arr = new int[num];
        
        System.out.println("enter " + num +" emlement");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter "+ (i+1 )+"th element: " );
            arr[i] = sc.nextInt();
        }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }

        

           
    }
}
