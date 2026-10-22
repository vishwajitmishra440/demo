public class floydstrianglepattern {
    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){ //outer loop for number of lines
            for(int j=1; j<=i; j++){ //inner loop for how many times will counter be printed
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
