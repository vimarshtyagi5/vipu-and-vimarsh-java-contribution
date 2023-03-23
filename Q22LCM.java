import java.util.Scanner;

public class Q22LCM {
    
    public void LCM(int n, int m)
    {
      for(int i=1;i<m*n;i++)
      {
        if(i%n==0&&i%m==0)
        {
            System.out.println(i);

            break;
        }
      }
    }

    public static void main(String[] args)
    {   Q22LCM h=new Q22LCM();
        Scanner s=new Scanner(System.in);

        h.LCM(s.nextInt(),s.nextInt());
        char c='.';
        int x=c;
        System.out.println(x);
        
    }
}
