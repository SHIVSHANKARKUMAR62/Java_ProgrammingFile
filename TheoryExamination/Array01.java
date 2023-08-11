package TheoryExamination;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Length:- ");
        int n = sc.nextInt();
        int []arr;
        int sum=0;
        arr = new int[n];
        System.out.print("Enter Array "+n+" Elements:- ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum of "+n+" Element is:- "+sum);
    }
}
