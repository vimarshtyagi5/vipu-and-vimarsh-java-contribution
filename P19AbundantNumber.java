import java.util.Scanner;
public class P19AbundantNumber {
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

       int sum=factorsum(n);
       if(sum>n)
       {
        System.out.println("No. is an abundant number");
       }


        
       
       
    }

}
