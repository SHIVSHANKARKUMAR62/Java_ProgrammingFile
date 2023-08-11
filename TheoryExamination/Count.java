package TheoryExamination;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value:- ");
        String value = sc.nextLine();
        int z = 0;
        for (int i=0;i<value.length();i++){
            z++;
        }
        System.out.println("Length of the String is:- "+z);
        int countWords = value.split("\\s").length;
        System.out.println(countWords);
    }
}
