package String_Package;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String:- ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second String:- ");
        String s2 = sc.nextLine();
        if (s1.equals(s2)){
            System.out.println("Hey Shiv.....");
        }else {
            System.out.println("Hello Shiv....");
        }
        if (s1==s2){
            System.out.println("Hey Sadhu.....");
        }else {
            System.out.println("Hello Sadhu....");
        }
    }
}
