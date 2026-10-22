import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++){
        //     if(i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of a loop");




        // keep entering numbers till user enters a multiple of 10.
         Scanner sc = new Scanner(System.in);

         do{
            System.err.print("enter your number : ");
            int n = sc.nextInt();
            if ( n % 10 == 0){
                break;
            }
            System.out.println(n);
         } while(true);
    }
}
