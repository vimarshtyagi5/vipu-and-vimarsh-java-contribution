import java.util.Scanner;

public class Q27RemovingZerosFromAnumber {
    static int reverse(int a)
    {
        int n=a;
         int rem,rev=0;
         while(n!=0)
        {   rem=n%10;
            if(rem==0)
           {rev=10*rev+1;
            n=n/10;     }

            else
            {rev=10*rev+rem;
                n=n/10;}
       }
       return rev;
    }

    static int removeZero(int A)
    {
        int n=A;
         int rem,rev=0;
        while(n!=0)
        {   
            rem=n%10;
            
           rev=10*rev+rem;
            n=n/10;    

            
       }
       return rev;

    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

         int a=s.nextInt();

         int A = reverse(a);

         int B=  removeZero(A);
         System.out.println(B);



         

        
    }
}
