package ThrowKeywords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class somenew {
    public static void main(String[] args) throws IOException {
        // this is a new way for try catch.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a Number:- ");
            int a = Integer.parseInt(br.readLine());
            System.out.println(a);
        }
    }
}
