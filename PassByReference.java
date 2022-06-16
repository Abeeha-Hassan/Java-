class PBReference
{
    int x,y;
    void swap(PBReference o)
    {
        int temp;
        temp=o.x;
        o.x=o.y;
        o.y=temp;
    }
}

public class PassByRefernce
{
    public static void main(String args[])
    {
        PBReference obj=new PBReference();
        obj.x=30;
        obj.y=20;
        System.out.println("Before Changes the Value of X: "+obj.x+"\t Y: "+obj.y);
        obj.swap(obj);
        System.out.println("After Changes the Value of X: "+obj.x+"\t Y: "+obj.y);
    }
}