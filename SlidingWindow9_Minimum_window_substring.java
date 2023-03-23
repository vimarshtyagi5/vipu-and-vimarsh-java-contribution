import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class SlidingWindow9_Minimum_window_substring {
    

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        HashMap<Character, Integer> map=new HashMap<>();
        String a="timetopractice";
        String b="toc";
        int mini=99;
        int count=0;
        int i=0,j=0,k;
        int big=0;
        // putting small substring in the map

        for(k=0;k<b.length();k++)
        {
            if(map.containsKey(b.charAt(k)))
            {
                int of=map.get(b.charAt(k));
                int nf=of+1;
                map.put(b.charAt(k),nf);
            }

            else
            {
                map.put((b.charAt(k)),1);
            }
        }

        count=map.size();
//      System.out.println(map);

        while(j<a.length())
        {
            if(map.containsKey(a.charAt(j)))
            {
                map.put(a.charAt(j),map.get(a.charAt(j))-1);
                if(map.get(a.charAt(j))==0)
                {
                    count--;
                }
            }

            if(count!=0)
            {
                j++;
            }

            else
            {
                while(count==0)
                {    mini=Math.min(mini,j-i+1);

                    if(map.containsKey(a.charAt(i)))
                    {
                        map.put(a.charAt(i),map.get(a.charAt(i))+1);

                        if(map.get(a.charAt(i))>0)
                        {
                            count++;
                        }
                    }
                    i++;
                }
                j++;

            }



        }


        System.out.println(mini);

    }
}
