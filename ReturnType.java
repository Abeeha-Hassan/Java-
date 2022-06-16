class Test
{
    int a;
    Test (int x)
    {
        a=x;
    }
    Test incByTen()
    {
        Test temp=new Test(a+10);
        return temp;
    }
}

class ReturnType
{
    public static void main(String args[])
    {
        Test obj1=new Test(10);
        //obj1.Test(10);
        Test obj2;
        obj2=obj1.incByTen();
        System.out.print("Obj1.a: "+obj1+"Obj2.b"+obj2);
    }
}