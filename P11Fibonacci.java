import java.util.Scanner;
public class P11Fibonacci {
    
    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);

     System.out.println("enter the size of fibonacci");

     int n=s.nextInt();
     int sum;
     int a=1;
     int b=1;
     System.out.print("1 1 ");
     for(int i=2;i<n;i++)
     {

        sum=a+b;
        a=b;
        b=sum;

        System.out.print(sum+" ");
     }






    }
}
