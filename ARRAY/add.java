package ARRAY;

public class add {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
        int sum = 0; 
        for (int i = 0; i < num.length; i++) {  
            if (num[i] % 2 == 0) {
                sum = sum + num[i];
            }
        }
        System.err.println(sum);
    }
}
