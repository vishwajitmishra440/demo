public class printinvertedandrotatedhalfpyramidpattern {
    public static void inverted_rotates_half_pyramid(int n){
        //outer loop this is for number of lines or rows.
        for(int i=1; i<=n; i++){
            //this is to print spaces.
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //this is inner loop to print the stars.
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotates_half_pyramid(4);
    }
}
