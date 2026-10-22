 package ARRAY;

 public class M {

    public static void main(String[] args) {

    char [] alfa = {'A','B','C','D','E'};
    // System.out.println(alfa.length);

     System.out.print("[");
     for (int i = 0; i < alfa.length; i++) {
        System.out.print(alfa[i]);
        if (alfa.length-1 <= i) {
            System.out.print(alfa[i]);
        }else{
            System.out.print(" ");
        }
     }
             System.out.print("]");

    }
}

//  ['A','B','C','D','E']