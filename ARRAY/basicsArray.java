package ARRAY;

public class basicsArray {
    public static void main(String[] args) {
        //print all elements of an array.
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
            System.out.print("[");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (num.length <= i) {
                System.out.print(num[i]);
            } else {
                System.out.print(" ");
            }
        }
            System.out.print("]");
    }
}
