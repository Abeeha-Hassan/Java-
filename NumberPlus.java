import java.util.Scanner;
public class NumberPlus
{
    public static void main(String args[])
    {
        int n,a,b,c,d,e,AN;
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter Five-Digit Number: ");
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

        AN=(a*1+1)(b*10+1)(c*100+1)(d*1000+1)(e*10000+1);
        System.out.print("Addition in each Number is: "+AN);
    }
}