import java.util.Scanner;
public class MainArray 
{
    public static void main(String args[])
    {
        int i,size,max,min,index,n,a[];
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        size=scan.nextInt();

        a=new int[size];

        System.out.print("Enter the Elements in an Array:\n");

        for(i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }

        max=a[0];
        index=0;
        min=a[0];
        n=0;

        for(i=0;i<size;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                index=i;
            }
            if(a[i]<min)
            {
                min=a[i];
                n=i;
            }
        }

        System.out.print("The Maximun Value is: "+max+" is at Index: "+index+"\nThe Minimum Value is: "+min+" is at Index: "+n);
    }
}
