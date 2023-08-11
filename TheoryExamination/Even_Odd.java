package TheoryExamination;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.print(n+" is a Even Number.");
        }else {
            System.out.print(n+" is a Odd Number.");
        }
    }
}
