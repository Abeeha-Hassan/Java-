import java.util.Scanner;
public class ArrayProgram
{
    public static void main(String args[])
    {
        int i,size;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        size = scan.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the Elements of an Array are: ");

        //Input;
        for(i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }

        //Output;
        for(i=0;i<size;i++)
        {
            System.out.print("Elements of an Array are: ");
            System.out.println(a[i]);
        }
    }
}