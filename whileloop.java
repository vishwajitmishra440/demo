import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        // while loop.(print hello world 100 times).

        // int counter = 0;
        // while (counter < 100) {
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("printer Hello World 100 times");
        




        // print number from 1 to 10 using while loop.

        // int counter = 1;
        // while (counter <= 10) {
        //     System.out.println(counter);
        //     counter++;
        // }




        // print number from 1 to n using while loop.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("please enter a number : ");
        // int range = sc.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        //     System.out.print(counter + " ");
        //     counter++;
        // }
        // System.out.println();





        // print sum of first n natural number using while loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;    //(sum = sum + i;)
            i ++;
        }
        System.out.println("sum is :" + sum);
    }
}
