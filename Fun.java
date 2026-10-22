 public class Fun {

    static int add(double a,double b) { // boject, float,double, byte, ...
        return (int)(a + b);   // arg with return type.
    }

    static void mult(int a, int b){
        System.out.println("hello : " + (a * b)); //arg with no return type.
    }

    static String div(){
        return "no arg with return";//no arg with return.
    }
    static void sub(){
        System.out.println("no arg no return");
    }
    public static void main(String[] args) {
        int mukesh = add(10.6, 20.1);
        System.out.println("Sum = " + mukesh);

        int result1 = add(23,200);
         System.out.println(result1);


         mult(34, 33);
         String name = div();
         System.out.println(name);


         sub();
    }

   
    
} 
    

// take arg  no return 
// wihtout arg retutn
// take arg return 
// without arg no return
