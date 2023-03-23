import java.util.Scanner;

public class Q24PermutationOfOccupyingSeat {

    static int fact(int x)
    {   int fact=1;
        for(int i=x;i>=1;i--)
        {
            fact=fact*i;
        }

        return fact;
    }

    public  void Ways(int n,int r)
    {
         System.out.println(fact(n)/(fact(n-r)));
    }
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Q24PermutationOfOccupyingSeat w=new Q24PermutationOfOccupyingSeat();


        System.out.println("Enter the value of x  and y");
        int n=s.nextInt();
        int r=s.nextInt();

        w.Ways(n,r);
    
    
    }
}
