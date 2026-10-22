import java.util.Scanner;

public class fun2 {
    // Function with arguments and no return type
    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum = " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // // Creating an object
        // ArgumentNoReturn obj = new ArgumentNoReturn();

        // // Calling the function
        // obj.sum(num1, num2);



        
        sum(num1, num2);

        sc.close();
    }
}
