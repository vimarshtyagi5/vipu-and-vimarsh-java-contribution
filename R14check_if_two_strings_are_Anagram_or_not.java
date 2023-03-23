import java.util.HashMap;

public class R14check_if_two_strings_are_Anagram_or_not {

    public static void main(String[] args) {
        HashMap<Character, Integer> m1 = new HashMap<>();

        HashMap<Character, Integer> m2 = new HashMap<>();

        String s1 = "vipcl";
        String s2 = "lupiv";

        for (int i = 0; i < s1.length(); i++) {
            if (m1.containsKey(s1.charAt(i))) {
                int of = m1.get(s1.charAt(i));
                int nf = of + 1;
                m1.put(s1.charAt(i), nf + 1);


            } else {
                m1.put(s1.charAt(i), 1);
            }

            // second hash map

        }

        for (int i = 0; i < s2.length(); i++) {
            if (m2.containsKey(s2.charAt(i))) {
                int of = m2.get(s2.charAt(i));
                int nf = of + 1;
                m1.put(s2.charAt(i), nf + 1);


            } else {
                m2.put(s2.charAt(i), 1);
            }
        }
        if (m1.equals(m2)) {
            System.out.println("it is an anagram");
        } else {

            System.out.println("it is not an anagram");


        }
    }
}