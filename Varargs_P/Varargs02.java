package Varargs_P;

public class Varargs02 {
    public static void main(String[] args) {
        varargs1 v = new varargs1();
        v.Show(3,4,5);
    }
}

class varargs1{
    double sum=0;
    public void Show(double ...a){
        for (double i : a){
            sum = sum+i;
        }
        System.out.print("Sum of The Number is:- "+sum);
    }
}
