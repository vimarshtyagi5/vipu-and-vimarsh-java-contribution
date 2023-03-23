import java.util.Scanner;
public class P15StrongNumber {
  static int factorial(int n)
  {
    int fact=1;
    for(int i=n;i>=1;i--)
    {
        fact=fact*i;
        
    }
    return fact;
    

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
            rev=rev+factorial(rem);
            
            
        }

        if(rev==a)
        {System.out.println("no is a strong one");}
    }
    
}
