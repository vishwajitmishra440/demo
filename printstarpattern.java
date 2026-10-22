public class printstarpattern {
    public static void main(String[] args) {
        for(int line=1; line<=4; line++){  //outer loop this is for number of lines present in the pattern
            for(int star=1; star<=line; star++){ //inner loop this is for the stars in that line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
