import java.util.Scanner;
public class SquarePlus
{
    public static void main(String args[])
    {
        double i,j,rows;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        rows=scan.nextDouble();
        
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=rows;j++)
            {
                if(i==1 || i==rows || i==rows/2 || j==1 || j==rows || j==rows/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}