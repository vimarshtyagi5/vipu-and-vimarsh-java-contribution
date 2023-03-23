import java.util.Scanner;
public class P12NthNumberOfAFibonacci {

    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);

     System.out.println("enter the Nth number of fibonacci");

     int n=s.nextInt();
     
     int a=1;
     int sum=a;
     int b=1;
     //System.out.print("1 1 ");
     if(n==1||n==2)
     {
        System.out.println("1");
     }

     else
     {
     for(int i=2;i<n;i++)
     {

        sum=a+b;
        a=b;
        b=sum;

       
     }

     System.out.print(sum+" ");






    }
    
}

}
