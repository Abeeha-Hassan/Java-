public class Method 
{
    static int plusMethod(int x, int y)
    {
        return x+y;
    }

    static double plusMethod(double x, double y)
    {
        return x+y;
    }

    public static void main(String args[])
    {
        int myNum1=plusMethod(10,20);
        double myNum2=plusMethod(30.99,499.010);

        System.out.print("Int: "+myNum1+"\n");
        System.out.print("Double: "+myNum2);
    }
}