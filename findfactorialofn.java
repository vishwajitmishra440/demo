import java.util.Scanner;

public class findfactorialofn {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f; //factorial of n.
    }
    public static void main(String[] args) {
        // System.out.println(factorial(4));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }
}
