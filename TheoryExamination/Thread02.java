package TheoryExamination;

class B implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a Runnable thread.......");
    }
}

public class Thread02 {
    public static void main(String[] args) {
        B b = new B();
        Thread t1 = new Thread(b);
        t1.start();

    }
}
