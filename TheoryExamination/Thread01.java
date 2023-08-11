package TheoryExamination;

class A extends Thread{
    @Override
    public void run() {
        System.out.println("Hello I am First Thread........");
    }
}

public class Thread01 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}
