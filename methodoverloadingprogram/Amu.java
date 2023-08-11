package methodoverloadingprogram;

class box
{
    int height,weight,depth;
    box(int h,int w,int d)
    {
        height=h;
        weight=w;
        depth=d;
    }
    box(int x)
    {
        height=weight=depth=x;
    }
    int volume()
    {
        int a=height*weight*depth;
        return(a);
    }
}
class shape
{
    public static void main(String arg[])
    {
        box b1=new box(20,30,40);
        box b2=new box(7);
        System.out.println("volume of rectangle is:"+b1.volume());
        System.out.println("volume of cube is"+b2.volume());
    }
}