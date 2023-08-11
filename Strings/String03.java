package Strings;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        System.out.print("Enter First String:- ");
        a=sc.nextLine();
        System.out.print("Enter Second String:- ");
        b=sc.nextLine();
        System.out.print("Compare the String:-  "+a.compareTo(b));
        System.out.println();
        System.out.println("concentration of two string is:- "+a.contentEquals(b));
    }
}
