import java.util.Scanner;

public class conditionalquestion {
    public static void main(String[] args) {
        

        //  Write a Javaprogram to get a number from the user and print whether it is positive or negative.


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("number is greater then 0");
        } else {
            System.out.println("number is less than 0");
        }
    }
}