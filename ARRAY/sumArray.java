package ARRAY;

public class sumArray {
    public static void main(String[] args) {
        int[] num = {12, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
        float avg = 0;
        float sum = 0;
        for (int i = 0; i < num.length; i++) {
            // if (num[i] % 2 ==0 ) {
            //     sum = sum + num[i];
            // }

            sum = sum + num[i];
        }
        avg = sum / num.length;
        System.out.println("sum is =" + sum);
        System.out.println("average = " + avg);
    }
}
