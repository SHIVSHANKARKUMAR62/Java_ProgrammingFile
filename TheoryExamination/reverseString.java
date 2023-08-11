package TheoryExamination;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value:- ");
        String name = sc.nextLine();
        String n="";
        char c;
        for (int i=name.length()-1;i>=0;i--){
            c = name.charAt(i);
            n = n + c;
        }
        System.out.println("Reverse String is:- "+n);

        StringBuffer sb = new StringBuffer(name);
        System.out.println("Second way to reverse the String:- "+sb.reverse());
        //System.out.println(sb.chars());

        StringBuilder s = new StringBuilder(name);
        System.out.println(s.substring(0,4));
        System.out.println("Third way to reverse the String:- "+s.reverse());
        System.out.println(s.length());
        System.out.println(name.subSequence(0,4));
        System.out.println(s.substring(0,4));

    }
}
