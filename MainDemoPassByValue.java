class PassByValue
{
    void swap(int x , int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;
    }
}

class MainDemoPassByValue
{
    public static void main(String args[])
    {
        int a=10,b=20;
        PassByValue obj=new PassByValue();
        System.out.print("Before calling a: "+a+"\tb: "+b+"\n");
        obj.swap(a,b);
        System.out.print("After calling a: "+a+"\tb: "+b+"\n");
    }
}