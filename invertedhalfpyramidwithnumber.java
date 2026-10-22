public class invertedhalfpyramidwithnumber {
    public static void inverted_half_pyramid_withNumber(int n){
        for(int i=1; i<=n; i++){ //outerloop for number of lines
            for(int j=1; j<=n-i+1; j++){ //innerloop for printing numbers
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid_withNumber(5);
    }
}
