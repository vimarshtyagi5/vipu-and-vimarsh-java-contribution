import java.util.Scanner;

public class R7PalindromeChecking_in_a_string {

    public static void  main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();

        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

       if(rev.equals(str))
       {
        System.out.println("it is a plaindrome");
       }

       else
       {
        System.out.println("it is a not a plaindrome");
       }

        
    }

}
