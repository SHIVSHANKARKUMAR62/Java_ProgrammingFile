package TheoryExamination;

class up{
    public void UPER(){
        System.out.println("This is a Upper class.");
    }

    static class Down{
        public void DOWN(){
            System.out.println("This is a Down class.");
        }
    }
}

public class innurclass {
    public static void main(String[] args) {
        up u = new up();
        u.UPER();
        up.Down ud = new up.Down();
        ud.DOWN();
    }
}
