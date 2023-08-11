package TheoryExamination;
class Super{
    public Super(){
        System.out.println("hey");
    }
    public void display1(){
        System.out.println("Display 1 class of Method....");
    }
}
class Sub extends Super{
    public Sub(){
        super();  // constructor me aise use hoga constructor call karne ko
        System.out.println("Hello");
    }
    public void display2(){
        super.display1();// method ko call karne ke lie aise use karenge.
        System.out.println("Display 2 class of Method....");
    }
}
public class Super_class {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.display2();
    }
}
