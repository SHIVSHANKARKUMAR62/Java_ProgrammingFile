package practices;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
