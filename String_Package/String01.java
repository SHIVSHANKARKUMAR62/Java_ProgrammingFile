package String_Package;

public class String01 {
    public static void main(String[] args) {
        String s1 = "Shiva";
        String s2 = "Shiva";
        String s3 = "SHIVA";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equals(s3));

    }
}
