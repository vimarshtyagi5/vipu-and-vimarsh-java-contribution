import java.util.Scanner;
public class P9Armstrong {
    static int pow(int x,int y)
    {int pow=1;
      for(int i=1;i<=y;i++)
      {
        pow=pow*x;
      }
      return pow;


    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int n=a;
        int m=a;
        int rem,rev=0,count=0;
        while(n!=0)
        {
          n=n/10;
          count++;
        }

        while(m!=0)
        {  rem=m%10;
            m=m/10;
            rev=rev+pow(rem,count);
            
            
        }
        System.out.println(rev);
}

}
