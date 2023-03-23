import java.util.Scanner;

public class P20FriendlySum {
    static int factorsum(int n)
    { int sum=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;

            }
        }
        return sum;
    }
    
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();


    int n1=n/factorsum(n);
    int n2=m/factorsum(m);
    if(n1==n2)
    {
     System.out.println("No's are friendly sum");
    }



    
}

}
