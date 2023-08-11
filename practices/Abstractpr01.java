package practices;
abstract  class sad{
    public void Morning(){
        System.out.println("Good Afternoon....");
    }
    abstract void greet();
    abstract void greet(int a);
}
class ss extends sad{
    public void greet(){
        System.out.println("Gd Morning....");
    }
    public void greet(int a){
        System.out.println("Gd Morning "+a+" times");
    }
}
public class Abstractpr01 {
    public static void main(String[] args) {
        ss s = new ss();
        s.greet(5);
        s.greet();
        s.Morning();
    }
}
