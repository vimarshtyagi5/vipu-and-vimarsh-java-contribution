import java.util.Scanner;

public class R6_Removing_vowel_and_other_Character_fromA_String {

    public static void main(String[] args)
        { Scanner s=new Scanner(System.in);
            
            String str=s.nextLine();
            String st="";

            String st1="";

    
            char [] ch= new char[str.length()];
            int count=0;
           // ch=str.toCharArray();

           for(int i=0;i<str.length();i++)
            {  ch[i]=str.charAt(i);
              if((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=126))
              {
                st1=st1+str.charAt(i);
                
              }
              else
              {
                st1=st1+"";
              }

             
            }

            System.out.println("string without any other character than alphbet "+st1);

            for(int i=0;i<st1.length();i++)
            {  ch[i]=st1.charAt(i);
              if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
              {
                
                st=st+"";
              }
              else
              {
                st=st+st1.charAt(i);
              }

             
            }

            
            System.out.println("string without any other character than alphbet and without vowel "+st);
    
          
    
            
    
           
        }
    
}
