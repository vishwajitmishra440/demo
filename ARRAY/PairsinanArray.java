package ARRAY;
import java.util.*;
public class PairsinanArray {
    public static void printPairs(int numbers[]){
        int totalpairs = 0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; //this currents folows from 1st element-2 to the last element-10 one by one.
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + totalpairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
