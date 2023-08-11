package TheoryExamination;

class FirstClass{
    public void display1(){
        System.out.println("I am First Class...");
    }
}

class SecondClass extends FirstClass{
    public void dispay2(){
        System.out.println("I am Second cLass....");
    }
}

public class Single_level_code {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.display1();
        sc.dispay2();
    }
}
