package ThrowKeywords;

import java.io.IOException;

public class inKeywordUsing {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a Number:- ");
        int num = System.in.read(); // they return the asking value.
        System.out.println(num);
    }
}
