import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String args[])
    {
        int n,a,b,c,d,e,reverse;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter Five-Digit Numbers: ");
        n=scan.nextInt();

        a=n%10;
        n=n/10;

        b=n%10;
        n=n/10;

        c=n%10;
        n=n/10;

        d=n%10;
        n=n/10;

        e=n%10;
        n=n/10;

        reverse=a*10000+b*1000+c*100+e*10+d*1;
        System.out.print("Reverse of Five-Digit Number is: "+reverse);
    }
}