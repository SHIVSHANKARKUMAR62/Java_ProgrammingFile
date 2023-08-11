package TheoryExamination;

class FirstClass01{
    public void display1(){
        System.out.println("I am First Class...");
    }
}

class SecondClass01 extends FirstClass01{
    public void display2(){
        System.out.println("I am Second cLass....");
    }
}

class ThirdClass01 extends SecondClass01{
    public void display3(){
        System.out.println("I am Second cLass....");
    }
}

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        ThirdClass01 t = new ThirdClass01();
        t.display1();
        t.display2();
        t.display3();
    }
}
