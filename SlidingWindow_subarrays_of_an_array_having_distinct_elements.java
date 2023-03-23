import java.util.HashMap;

public class SlidingWindow_subarrays_of_an_array_having_distinct_elements
   {
       public static void main(String[] args)
       {
           HashMap<Integer,Integer> m=new HashMap<>();

           int [] a={5,2,3,5,4,3};
           int k=5;
           int j=0,i=0,count=0;


           while(j<a.length) {

                   if (m.containsKey(a[j])) {
                       int of = m.get(a[j]);
                       int nf = of + 1;

                       m.put(a[j], nf);
                   }

                   else {
                       m.put(a[j], 1);
                   }

                   if(m.get(a[j])<=1)
                   {
                       j++;

                   }

                   else {

                       if(m.containsKey(a[i]))
                       {
                           m.put(a[i],m.get(a[i])-1);
                           if(m.get(a[i])==0)
                           {
                               m.remove(a[i]);
                           }
                           i++;
                       }
                       if(m.size()>1)
                       {
                           System.out.println(i+" "+j);
                       }
                       j++;
                   }


               System.out.println(m);

               }




           }



   }
