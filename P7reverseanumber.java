import java.util.Scanner;

public class P7reverseanumber {
  
    public static void main(String[] args)
    {
      Scanner s= new Scanner(System.in);
      int a=s.nextInt();
      int n=a;
      int rem,rev=0;
      while(n!=0)
      {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;

      }

      System.out.println(rev);
      
    }

}
