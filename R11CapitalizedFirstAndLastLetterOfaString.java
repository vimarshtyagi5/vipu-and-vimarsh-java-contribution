public class R11CapitalizedFirstAndLastLetterOfaString {

    public static void main(String[] args)
    {

        String str="vipultyagi";

        char [] c=new char[str.length()];

        c=str.toCharArray();

        c[0]=Character.toUpperCase(c[0]);
        c[str.length()-1]=Character.toUpperCase(c[str.length()-1]);

        for(int i=0;i<str.length();i++)
        {
            System.out.print(c[i]);
        }


    }
}
