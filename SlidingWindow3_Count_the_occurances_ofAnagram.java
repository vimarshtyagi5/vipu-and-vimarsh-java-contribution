import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SlidingWindow3_Count_the_occurances_ofAnagram {

    public static void main(String[] args)
    {

        Scanner s1=new Scanner(System.in);
        HashMap <Character,Integer> m=new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        String s="aababaa";
        int i=0,j=0;
        String p="aaba";
        int n=s.length();
        int k=p.length();
        int count=0;
        int count1=0;
        int sum=0;

        // putting all  element of sub string  "p" in the map

        for(int g=0;g<p.length();g++)
        { char c=p.charAt(g);
            if(m.containsKey(c))
            {
                int of=m.get(c);
                int nf=of+1;

                m.put(c,nf);
            }
            else
            {
                m.put(c,1);
            }

        }
        count=m.size();
        //System.out.println(count);

 while(j<n)
        {
            if(m.containsKey(s.charAt(j))){
            m.put(s.charAt(j),m.get(s.charAt(j))-1);
            if(m.get(s.charAt(j))==0){
                count--;
            }
        }
           // System.out.println(m);
           // System.out.println(count);
        //window size less than k
        if(j-i+1<p.length())
            j++;

        else if(j-i+1==p.length()){
            //ans calculate
           // System.out.print(1);
            if(count==0){
                sum=sum+1;

                //remove ans of i before sliding
            }
            if(m.containsKey(s.charAt(i))){  // yaha par hmne map ki jo jo freq subtract ki thi "i" ki, ab pehle wale ki freq dobara bhada denge
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
                if(m.get(s.charAt(i))==1) // ye bahut important hai qki agar >=1 ya >0 rakhoge to vo har baar bhadaeyegaa
                {
                    count++;
                }
                i++;


            }
            j++;


        }


        }


        System.out.println(sum);
    }


}
