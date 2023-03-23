import java.util.Scanner;

public class R8_Removing_spaces_fromA_String {
    

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
              if(ch[i]==' ')
              { st1=st1+"";
                
                
              }
              else
              {
                st1=st1+str.charAt(i);
              }

             
            }

            System.out.println("string without any spaces : "+st1);

            
          
    
            
    
           
        }
}
