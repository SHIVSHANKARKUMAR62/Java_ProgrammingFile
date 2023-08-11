package String_Package;

public class String04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shiv");
        sb.append("Kumar");
        System.out.println(sb);
        sb.insert(4,"Sadhu");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int a = sb.capacity();
        System.out.println(a);
        sb.ensureCapacity(50);
        System.out.println(sb);
        System.out.println(System.currentTimeMillis());
    }
}
