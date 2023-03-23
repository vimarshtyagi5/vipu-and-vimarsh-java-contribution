import java.util.Scanner;
public class sumofNumberInGivenRange {
    
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
      System.out.println("Enter the range");
      int a=s.nextInt();
      int b=s.nextInt();
        int sum=0;

      for(int i=a+1;i<b;i++)
      {      
            sum=sum+i;
      }
      System.out.println("Sum of the numbers present between "+ a+" and "+b +" is "+sum);

    }
}
