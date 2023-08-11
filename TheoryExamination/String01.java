package TheoryExamination;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value:- ");
        String name = sc.nextLine();
        int n = name.length();
        String nm = "";
        for (int i=0;i<n;i++){
            nm = nm + name.substring(i,n);
        }
        System.out.println(nm);
    }
}
