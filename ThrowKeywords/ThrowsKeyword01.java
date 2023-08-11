package ThrowKeywords;
class A {

    // throws keywords used only with a method not a class. after that we used throws keyword in main class method.
    public void Show() throws ClassNotFoundException{
        Class.forName("Hello");
    }
}
public class ThrowsKeyword01{
    public static void main(String[] args){
        A a = new A();
        try {
            a.Show();
            System.out.println("There have....");
        }catch (ClassNotFoundException c){
            System.out.println("There have no......");
            c.printStackTrace();
        }
    }
}
