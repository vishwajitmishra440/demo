public class zeroonetrianglepattern {
    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){ //outerloop for number of lines
            for(int j=1; j<=i; j++){ //innerloop to printing numbers
                if((i+j) % 2 == 0){ // this is for even with is present in the rows and columns
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one_triangle(5);
    }
}
