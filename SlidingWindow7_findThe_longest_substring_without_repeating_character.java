import java.util.HashMap;

public class SlidingWindow7_findThe_longest_substring_without_repeating_character {
    

    public static void  main(String[] args)
    {
        HashMap<Character,Integer> m=new HashMap<>();
        String st="pwwnmghkew";
         int key=3;
        
         int i=0,j=0,max=0;
        
 
         while (j < st.length())
         { // entering the of string into a map
             if(m.containsKey(st.charAt(j)))
             {
                 int of=m.get(st.charAt(j));
                 int nf=of+1;
                 m.put(st.charAt(j),nf);
             }
             else{
                 m.put(st.charAt(j),1);
             }
             
             /* now we will check whether the size of map == key 
             (size of map shows the no of distinct key present in it, in this whole string there are 4 distinct keys :- a,b,c,d )
              so size of this map would be 4*/
 
             if(m.size()==j-i+1)
             {
                 max = Math.max(max, (j - i + 1));  // we compare our length of the string with previous lengths
                 
             }
             else
             {
                 
                     m.put(st.charAt(i),m.get(st.charAt(i))-1);
                     if(m.get(st.charAt(i))==0) /* if the frequency or value of a particular key = 0 then we will 
                                                   remove that particular key as well and the size of map get reduce 
                                                   automatically, then again it will go to the top of iteration*/
                     {
                         m.remove(st.charAt(i));
                     }
                     i++;
                     if(m.size() == key)
             {
                 max = Math.max(max, (j - i + 1)); 
                 
             }
 
 
                 
                 
             } 
             
 
             j++;
 
         }
 
         System.out.println(max);
     
 
    }
 
         
     
 
    }
