import java.util.Scanner;

public class continuestatement {
    public static void main(String[] args) {
        // for (int i=1; i<=5; i++){
        //     if(i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }




        //display all numbers entered by user except multiples of 10 using continue statement.
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter your number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was : " + n);
        } while(true);
    }
}
