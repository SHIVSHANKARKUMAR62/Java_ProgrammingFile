package TheoryExamination;

class First extends Thread{
    @Override
    public void run() {
        System.out.println("Hey I am First Thread....");
    }
}

class Second extends Thread{
    @Override
    public void run() {
        System.out.println("Hey I am Second Thread....");
    }
}

public class Thread03 {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();
        first.setPriority(Thread.MAX_PRIORITY);
        first.start();
        second.setPriority(Thread.MIN_PRIORITY);
        second
                .start();

        System.out.println("First Thread Name is:- "+first.getName());
        System.out.println("Second Thread Name is:- "+second.getName());

        first.setName("First Thread........");
        second.setName("Second Thread.......");

        System.out.println("First Thread Name is:- "+first.getName());
        System.out.println("Second Thread Name is:- "+second.getName());
    }
}
