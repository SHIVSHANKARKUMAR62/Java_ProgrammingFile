package TheoryExamination;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String n1 = A.substring(0,1).toUpperCase()+A.substring(1);
        String n2 = B.substring(0,1).toUpperCase()+B.substring(1);
//        System.out.println(n1);
//        System.out.println(n2);
        int length = n1.concat(n2).length();
        System.out.println(length);
        if (A.equals(B)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(n1+" "+n2);
    }
}
