public class hollowrectanglepattern {
    public static void hollow_rextangle(int toRows, int toColumns){
        //outer loop - Rows
        for (int i = 1; i <= toRows; i++) {
            //inner loop for columns
            for (int j = 1; j <= toColumns; j++) {
                //cell - (i,j)
                if (i == 1 || i == toRows || j == 1 || j == toColumns) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
    }
    public static void main(String[] args) {
        hollow_rextangle(4, 5);
    }
}
