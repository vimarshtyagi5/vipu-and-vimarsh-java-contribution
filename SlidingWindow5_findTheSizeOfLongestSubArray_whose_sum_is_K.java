public class SlidingWindow5_findTheSizeOfLongestSubArray_whose_sum_is_K {

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

       int [] array={4,1,1,1,1,1,2,3,5};
        int sum=19;
        int localSum=0;
        int i=0,j=0,max=0;
        int count=0;

        while (j < array.length)
        {
            localSum = localSum + array[j];

            if(localSum == sum)
            {
                max = Math.max(max, (j - i + 1));
                
            }
            else
            {
                while(localSum > sum)
                {
                    localSum -= array[i];
                    i++;
                    if (localSum == sum)
                    {
                        max = Math.max(max, (j - i + 1));
                    }
                }
                
            }
            j++;
            
        }
        System.out.println(max);

   }

    
}
