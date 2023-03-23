import java.util.Scanner;

public class R5_Toggle_theCharacters_in_The_Sting {

    
        public static void main(String[] args)
        { Scanner s=new Scanner(System.in);
            
            String str=s.nextLine();
    
            char [] ch= new char[str.length()];
            int count=0;
            for(int i=0;i<str.length();i++)
            { int x=str.charAt(i);
             if(x>=65&&x<90)
             {
            ch[i]=Character.toLowerCase(str.charAt(i));
             }
             else{
                ch[i]=Character.toUpperCase(str.charAt(i));
             }

             System.out.print(ch[i]);
            }
    
          
    
            
    
           
        }
    
}

