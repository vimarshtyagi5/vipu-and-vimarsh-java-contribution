import java.util.HashMap;

public class SlidingWindow_Find_distinct_element_in_every_subArrayOf_size_k {

    public static void main(String[] args)
    {
        HashMap<Integer,Integer> m=new HashMap<>();

        int [] a={2, 1, 2, 3, 2, 1, 4, 5 };
        int k=5;
        int j=0,i=0,count=0;


        while(j<a.length)
        {
            if(m.containsKey(a[j]))
            {
                int of=m.get(a[j]);
                int nf=of+1;

                m.put(a[j],nf);
            }
            else
            {
                m.put(a[j],1);
            }

            if(j-i+1<k)
            {
                j++;
            }

            else {

                System.out.print("The count of distinct elements in subarray ");

                for(int x=i;x<=j;x++)
                {
                    System.out.print(a[x]+" ");
                }

                System.out.println("is "+m.size());

                if(m.containsKey(a[i]))
                {
                    m.put(a[i],m.get(a[i])-1);
                    if(m.get(a[i])==0)
                    {
                        m.remove(a[i]);
                    }
                   i++;
                }
                j++;

            }










        }



    }
}
