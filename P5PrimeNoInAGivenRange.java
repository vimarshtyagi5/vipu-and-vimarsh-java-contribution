import java.util.Scanner;
public class P5PrimeNoInAGivenRange {
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
      System.out.println("Enter the range");
      int a=s.nextInt();
      int b=s.nextInt();
        int sum=0;

      for(int i=a;i<=b;i++)
      {      sum=0;
           for(int j=1;j<i;j++)
           {
            if(i%j==0)
            {
              sum++;
            }
           }

           if(sum==1)
           {System.out.println(i);}
      }

    }

}
