package TheoryExamination;
class one{
    // static method will be called without creating the object of the class.
    static void display(){
        System.out.println("This is The method of One class.....");
    }
}
public class Staticmethod {
    static void diaplayMain(){
        System.out.println("This is a main class static method.");
    }
    public static void main(String[] args) {
        one.display();  // this is a way to call the static method which is present in the outer of the class.
        diaplayMain(); // this is a way to main class static method.
    }
}
