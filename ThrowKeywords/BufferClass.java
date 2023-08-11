package ThrowKeywords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferClass {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a Number:- ");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);   // they take the value as the String format.
        int a = Integer.parseInt(br.readLine());
        System.out.println(a);
        System.out.print("Enter a String value:- ");
        String name = br.readLine();
        System.out.println(name);
        br.close(); // this is used to close the resource.this is a better way. then nobody to access your data.
    }
}
