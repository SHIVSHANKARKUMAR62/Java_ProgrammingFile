package TheoryExamination;

public class Garbage01 {

    public void finalize(){
        System.out.println("object is garbage collected");
    }


    public static void main(String[] args) {
        Garbage01 garbage01 = new Garbage01();
        Garbage01 garbage011 = new Garbage01();
        garbage01=null;
        garbage011=null;
        System.gc();

    }
}
