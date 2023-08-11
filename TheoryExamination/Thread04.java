package TheoryExamination;

class Three extends Thread{
    int n = 50;

    @Override
    public void run() {
        for (int i=0;i<n;i++){
            System.out.println("I am First Thread.....");
        }
    }
}

class Four extends Thread{
    int n = 50;

    @Override
    public void run() {
        for (int i=0;i<n;i++){
            System.out.println("I am Second Thread.....");
        }
    }
}

public class Thread04 {
    public static void main(String[] args) {
        Three three = new Three();
        Four four = new Four();
        //three.setPriority(5);
        three.start();
        four.start();
    }
}
