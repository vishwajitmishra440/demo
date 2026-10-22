package String;

public class ComparisionofString {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
        //equals function is used to comare that the character stored in s1 and s3 are same or not because in the above if else condition we compared the same but the output given is not satisfied.
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
    }
}
