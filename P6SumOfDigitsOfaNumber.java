import java.util.Scanner;
public class P6SumOfDigitsOfaNumber {
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
      System.out.println("Enter the range");
      int a=s.nextInt();
      int n=a;
      int sum=0;
      while(a!=0)
      { int r=a%10;
        sum=sum+r;
        a=a/10;
        
      }
      System.out.println(sum);
     
    }
}

