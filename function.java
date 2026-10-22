import java.util.Scanner;

public class function {
    //in this we are creating a function that prints hello world.
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a = sc.nextInt();
        System.out.println("enter second number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }
    public static void main(String[] args) {
        printHelloWorld();  //we are caliing that function we have already created above to print Hello World.
        calculatesum();
    }
}
