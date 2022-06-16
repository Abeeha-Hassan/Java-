class Box
{
    Box(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
}

class MainDemoConstructor
{
    public static void main(String args[])
    {
        Box obj1=new Box(2,3,5);
        Box obj2=new Box(6,7,9);

      /***   obj1.width();        
        obj1.height();
        obj1.depth();

        obj2.width();        
        obj2.height();
        obj2.depth();***/

        obj1.Box();
        obj2.Box();

        System.out.println(obj1.width+"\t"+obj1.height+"\t"+obj1.depth);
        System.out.println(obj2.width+"\t"+obj2.height+"\t"+obj2.depth);
    }
}