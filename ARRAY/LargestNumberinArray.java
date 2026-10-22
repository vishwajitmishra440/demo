
package ARRAY;
import java.util.*;
//finding largest number in array.
public class LargestNumberinArray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // it signifies minimum value(-infinity) 6
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){    
                largest = numbers[i];
            }           
        }
        return largest;
    }

    public static int getsmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE; // it signifies maximum values(+infinity)
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        int   L= getLargest(numbers);

        int  S = getsmallest(numbers);

        System.out.println("largest value is : " + L);
        System.out.println("Smallest value is : " + S);
    }
}
