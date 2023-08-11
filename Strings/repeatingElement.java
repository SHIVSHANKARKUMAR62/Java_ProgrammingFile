package Strings;

public class repeatingElement {
    public static void main(String[] args) {
        int []a = {1,2,3,3,5,3,5};
        int []b = new int[a.length];
        for (int i=0;i<b.length;i++){
            if (b[a[i]]==1){
                System.out.print(a[i]);
            }else {
                b[a[i]]++;
            }
        }
    }
}
