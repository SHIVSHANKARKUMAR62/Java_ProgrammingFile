/**
 * this class is made by shiv
 * @author Shivshankar kumar
 * @version 0.2
 * @since 2021
 * */

package practices;

import java.util.Scanner;

class add{
    int x,y;
    add(int a,int b){
        x=a;
        y=b;
    }
    public  int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void display(){
        System.out.print("Sum of first and second value is "+(x+y));
    }
}
public class MethodOverloadingAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First value is:- ");
        int a = sc.nextInt();
        System.out.print("Enter the Second value:- ");
        int b = sc.nextInt();
        add c = new add(a,b);
        c.display();
    }
}
