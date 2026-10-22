import java.util.Scanner;

public class argwithreturntype {
    static int sum(int a, int b){
    return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        int result = sum(num1, num2);
        System.out.println("sum = " + result);
    }
}
