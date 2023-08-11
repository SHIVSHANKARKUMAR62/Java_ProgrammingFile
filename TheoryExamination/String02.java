package TheoryExamination;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value;
        System.out.print("Enter a String value:- ");
        value = sc.nextLine();
        System.out.println("Upper case value of a String is:- "+value.toUpperCase());
        System.out.print("Lower case value of a String is:- "+value.toLowerCase());
    }
}
