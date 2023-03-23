import java.util.Scanner;

public class Q21HCF {
    public void HCF(int n, int m)
    {
      for(int i=n;i>=1;i--)
      {
        if(n%i==0&&m%i==0)
        {
            System.out.println(i);

            break;
        }
      }
    }
    public static void main(String[] args)
    {   Q21HCF h=new Q21HCF();
        Scanner s=new Scanner(System.in);

        h.HCF(s.nextInt(),s.nextInt());
        
    }
}
