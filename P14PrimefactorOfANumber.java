import java.util.Scanner;
public class P14PrimefactorOfANumber {
    static int checkprime(int x)
    {  int count=0;
        for(int i=2;i<=x;i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }

        if(count==1)
        {
            return 1;
        }
        else
        return 0;
        
    }
    

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            { if(checkprime(i)==1)
                System.out.print(i+" ");
            }
        }


    }
}
