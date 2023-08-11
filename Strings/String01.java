package Strings;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name:- ");
        String a = sc.nextLine();
        System.out.println("Enter Last Name:- ");
        String b = sc.nextLine();
        System.out.println("My Name is "+a+""+b);
    }
}
