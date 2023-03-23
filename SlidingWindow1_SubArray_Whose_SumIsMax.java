import java.util.Scanner;

public class SlidingWindow1_SubArray_Whose_SumIsMax {
    static int sum(int[] b,int n)
    { int s=0;
        for(int i=0;i<n;i++)
        {
           s=s+b[i]; 
        }

        return s;
    }
    {

    }
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);

    int [] a={2,3,5,2,9};
    int k=3;

    /*int [] b= new int[3];
    int max=0;

    for(int i=0;i<7-3+1;i++)
    {   int p=i; 
        for(int j=0;j<3;j++)
        {
           b[j]=a[p];
           p++;
        }

        if(max<sum(b,3))
        {
            max=sum(b,3);
        }    
    }
System.out.println(max); */

// ab karte hai sliding window se 

    int i=0; // start of window 
    int j=0; // end of window
    int sum=0;
    int max=0;
    while(j<5)
    {
       sum=sum+a[j];
       if(j-i+1<k)
       {
        j++;
       }
       else if(j-i+1==k)
       {
        max=Math.max(max, sum);
        sum=sum-a[i];
        j++;
        i++;
        
       }
     }

     System.out.println(max);




}
    
}
