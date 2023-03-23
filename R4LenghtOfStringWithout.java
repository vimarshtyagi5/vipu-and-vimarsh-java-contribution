import java.util.Scanner;

public class R4LenghtOfStringWithout {
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
        
        String c=s.nextLine();

        char [] ch=c.toCharArray();
        int count=0;
        for(char i:ch)
        {
         count++;
        }

        System.out.println("Total length is "+count);

        

       
    }

}
