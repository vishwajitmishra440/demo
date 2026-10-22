package ARRAY;
import java.util.*;
public class ReverseanArray {
    public static void reverse(int numbers[]){
        int first = 0, last=numbers.length-1;

        while (first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void rev(int num[]){
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        // reverse(numbers);
        rev(numbers);

        //print 
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();
    }
}
