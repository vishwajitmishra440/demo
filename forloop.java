import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        // print hello wold 10 times using for loop.

        // for(int i = 1; i<=10; i++){
        // System.out.println("Hello World");
        // }



        // print square pattern using for loop.
        // for(int line = 1; line <= 4; line++) {
        //     System.err.println("****");
        // }




        // print square pattern using while loop.
        // int line = 1;
        // while (line <=4) {
        //     System.out.println("****");
        //     line++;
        // }



        //print reverse of a number using while loop.
        // int n = 10899;
        // while (n > 0) {
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n / 10; //n/=10;
        // }
        // System.out.println();



        //reverse the given number using while loop.
        // int n = 10899;
        // int rev = 0 ;
        // while(n > 0){
        //     int lastdigit = n % 10;
        //     rev = (rev*10) + lastdigit;
        //     n = n/10;
        // }
        // System.out.println(rev);






        //check if a number is primw or not using for loop.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2){
            System.out.println("n is prime");
        } else{
        boolean isprime = true;
        for(int i=2; i<=n-1; i++){
            if(n % 1 == 0) { // n is a multiple of i (i not equal to 1 )
                isprime = false;
            }
        }
        if(isprime == true){
            System.err.println("n is prime");
        } else {
            System.out.println("n is not prime");
        }
        } 
    }
}
