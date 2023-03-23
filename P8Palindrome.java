import java.util.Scanner;
public class P8Palindrome {
    
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

     if(rev==a)
     {
        System.out.println("Number is a palindrome");
     }
      else
      
      System.out.println("Number is not a palindrome");
    }
}
