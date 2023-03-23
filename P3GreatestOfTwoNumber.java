 import java.util.Scanner;
public class P3GreatestOfTwoNumber {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b&&a>c)
        {
          
            System.out.println(a +" is bigger");
          

        }
        else if(b>c&&b>a)
        {
            
                System.out.println(b +" is bigger");
            
        }
        else 
        {
            System.out.println(c +" is bigger");
        }
        //a>=b?System.out.println(a +"is bigger"):System.out.println(b +"is bigger");

      
        
    }
    
}
