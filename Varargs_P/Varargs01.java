package Varargs_P;

public class Varargs01 {
    public static void main(String[] args) {
        varargs v = new varargs();
        v.Show(3,4,5);
    }
}

class varargs{
    public void Show(int ...a){
        for (int i : a){
            System.out.print(i+" ");
        }
    }
}