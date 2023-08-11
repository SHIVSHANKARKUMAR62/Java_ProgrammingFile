package TheoryExamination;

import java.util.Scanner;

public class Rectangle_of_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length,breath;
        System.out.print("Enter the value of a Length:- ");
        length = sc.nextInt();
        System.out.print("Enter the value of Breath:- ");
        breath = sc.nextInt();
        System.out.print("Rectangle of an Area is:- "+(length*breath));
    }
}
