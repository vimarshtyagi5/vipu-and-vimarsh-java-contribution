public class SlidingWindow4_MaximumOf_all_subArray {
     static int maximum(int a,int b)
     { int temp;

        if(a>b)
        {
            return a;
        }
        else 
        return b;
     }
    public static void  main(String[] args)
    {

        int [] a={1,3,-1,-3,5,3,6,7};
         int k=3;
         int sum=0;
         int i=0,j=0,max=0;

         while(j<a.length)
         { sum=sum+a[j];

            if(j-i+1<k)
            {
                j++;
            }

            else if(j-i+1==k)
            { max=maximum(sum,max);

                sum=sum-a[i];
                i++;
                j++;
            }

         }

         System.out.println("maximum sum of sub array is "+max);

    }


}
