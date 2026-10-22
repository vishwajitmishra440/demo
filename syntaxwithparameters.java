import java.util.*;
public class syntaxwithparameters {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculatesum( int a, int b){   // here int a & int b are parameters or formal parameters.
        
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr first number : ");
        int a = sc.nextInt();
        System.out.println("enter second number :");
        int b = sc.nextInt();
        int sum = calculatesum(a, b);  // here a & b are arguments or actual parameters
        System.out.println("sum is :" + sum);
    }
}
