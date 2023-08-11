package String_Package;
class Fan{
    String brand="Own",color="Red";
    int blades=2,price=45555;
    void Starting(){
        System.out.println("Starting...");
    }
    void rotating(){
        System.out.println("Rotating...");
    }
    void blowing(){
        System.out.println("Blowing...");
    }
    void stoping(){
        System.out.println("Stoping...");
    }
}
public class ToGgle {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        Fan f3 = new Fan();
        f1.Starting();
        f1.stoping();
        f2.Starting();
        f2.rotating();
        f3.Starting();
        f3.blowing();
        f3.rotating();
        f3.stoping();


    }
}
