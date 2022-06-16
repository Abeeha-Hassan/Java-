import java.util.Scanner;
public class Numbers
{
    public static void main(String args[])
    {
        int  n1,n2,add,sub,mult;
        float div;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First Value: ");
        n1=scan.nextInt();
        System.out.print("Enter Second Value: ");
        n2=scan.nextInt();
        add=n1+n2;
        System.out.println("Addition of Two NUmbers is: "+add);
        sub=n1-n2;
        System.out.println("Subtraction of Two Numbers is: "+sub);
        mult=n1*n2;
        System.out.println("Multiplication of Two Numbers is: "+mult);
        div=n1/n2;
        System.out.println("Division of Two Numbers is: "+div);
    }
}