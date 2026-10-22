package String;
public class Immutable {
    public static void main(String[] args) {
        String s1 = "Ram";
        String s2 = "Ram";


        String s3 = new String("Ram");
        String s4 = new String("Ram");
        System.out.println( s3 == s4);
        System.out.println(s3);
        System.out.println(s3.compareTo(s4));
    }
}
