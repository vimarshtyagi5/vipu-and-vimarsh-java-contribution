import java.util.HashMap;
import java.util.Scanner;

public class SlidingWindow8_pickToy {
    
    public static void main(String[] args)
    {  
        Scanner s=new Scanner(System.in);
        HashMap<Character, Integer> m=new HashMap<>();
        String a="abacacdab";
        int k=2;
        int i=0,j=0;
        int maxi=0;


        while(j<a.length())
        {
            if(m.containsKey(a.charAt(j)))
            {
                int of=m.get(a.charAt(j));
                int nf=of+1;
                m.put(a.charAt(j),nf);
            }

            else{
                m.put(a.charAt(j),1);
           
            }

            if(m.size()==k)
                 {
                    maxi=Math.max(maxi, j-i+1);

                 }

            

           

            else
            {
                 while(m.size()>k)
                 {
                    m.put(a.charAt(i),m.get(a.charAt(i))-1);

                    if(m.containsKey(a.charAt(i)))
                    {
                        m.remove(a.charAt(i));
                    }
                    i++;
                 }

                 if(m.size()==k)
                 {
                    maxi=Math.max(maxi, j-i+1);

                 }

                
                

            }
            j++;

        }
        System.out.println(maxi-1);
        

    }
}
