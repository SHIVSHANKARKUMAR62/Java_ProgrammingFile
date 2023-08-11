package practices;

import java.util.Scanner;

class first{
    int length,breath;
    first(int length,int breath){
        this.length=length;
        this.breath=breath;
    }
//    public void setLength(int length){
//        this.length=length;
//    }
    public int getLength(){
        return length;
    }
//    public void setBreath(int breath){
//        this.breath=breath;
//    }
    public int getBreath(){
        return breath;
    }
    public void DisplayArea(){
        System.out.print("Area of Cube is "+(length*breath));
    }
}
class second extends first{
    int height;
    second(int length,int breath,int height){
        // ak constructor se hi dusre constructor ko call kr sakte hai throgh 'super()' class
        super(length,breath);
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public void DisplayVolume(){
        System.out.print("Volume of a Cube is :- "+(length*breath*height));
    }
}
public class Inheritance01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Length is :- ");
        int a = sc.nextInt();
        System.out.print("Enter the value of Breath :- ");
        int b = sc.nextInt();
        first f = new first(a,b);
        System.out.println("Value of Length is:- "+f.getLength());
        System.out.println("Value of breath is:- "+f.getBreath());
        f.DisplayArea();
        System.out.println();
        System.out.print("Enter value of Height :- ");
        int c = sc.nextInt();
        second s = new second(a,b,c);
        System.out.println("Height of the cube is :- "+s.getHeight());
        s.DisplayVolume();
    }
}
