package ThrowKeywords;
class throwclass {
    int count;
    public synchronized void increment(){
        count++;
    }
    // int -> int is a preventive value Integer is the class
}
public class throwkeyword {
    public static void main(String[] args) throws InterruptedException {
        throwclass t = new throwclass();
        Runnable b = () -> {
                for (int i=1;i<=10000;i++) {
                    t.increment();
                }
        };

        Runnable b2 = () -> {
            for (int i=1;i<=10000;i++) {
                t.increment();
            }
        };

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t.count);

    }
}
