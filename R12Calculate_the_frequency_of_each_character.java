import java.util.HashMap;

public class R12Calculate_the_frequency_of_each_character {

    public static void main(String[] args)
    {
        HashMap<Character,Integer> m=new HashMap<>();


        String s="aabaabbbsljdvbslhdbv sjldhb jkxb";

        for(int i=0;i<s.length();i++)
        {
            if(m.containsKey(s.charAt(i)))
            {
                int of=m.get(s.charAt(i));
                int nf=of+1;
                m.put(s.charAt(i),nf);
            }

            else {
                m.put(s.charAt(i),1);
            }
        }

        for(Character k:m.keySet())
        {
            System.out.println(k+" : "+m.get(k));
        }

    }
}

