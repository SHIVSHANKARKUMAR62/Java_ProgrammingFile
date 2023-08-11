package TheoryExamination;

import java.util.Locale;
import java.util.Scanner;

public class String_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value:- ");
        String value = sc.nextLine();
        String ne = "";
        int n = value.length();
        for (int i=n-1;i>=0;i--){
            ne = ne + value.charAt(i);
        }
        if (ne.equals(value)){
            System.out.print(value+" is a Palindrome Number.");
        }else {
            System.out.print(value+" is not a Palindrome Number.");
        }
    }
}
