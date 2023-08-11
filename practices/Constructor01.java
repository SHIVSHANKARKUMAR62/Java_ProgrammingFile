package practices;

import java.util.Scanner;

class shiv{
    int a;
    int b;
    shiv(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void sum(){
        int c;
        c=a+b;
        System.out.print("Sum of 1st and 2nd Number is:- "+c);
    }
}
public class Constructor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the 1st value:- ");
        a=sc.nextInt();
        System.out.print("Enter the 2nd value:- ");
        b=sc.nextInt();
        shiv s = new shiv(a,b);
        System.out.println("1st value is:- "+s.getA());
        System.out.println("2nd value is:- "+s.getB());
        s.sum();
    }
}
