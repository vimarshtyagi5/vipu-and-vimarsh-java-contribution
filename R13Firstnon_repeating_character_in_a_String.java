import java.util.*;
import java.util.stream.Collectors;

public class R13Firstnon_repeating_character_in_a_String {

    public static void main(String[] args)
    {

                List<Map.Entry<Character, Integer>> l=new ArrayList<Map.Entry<Character, Integer>>();
        HashMap<Character,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);

        String s="prepinsta";

        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int of= map.get(s.charAt(i));
                int nf=of+1;

                map.put(s.charAt(i),nf);
            }

            else {

                map.put(s.charAt(i),1);
            }
        }

        System.out.println(map);

      l=map.entrySet().stream().collect(Collectors.toList());

        System.out.println(l);



    }


}
