import java.util.Scanner;

public class Q26FractionSum {
    
    static int lcm(int b,int y)
    {  int l=1;
        for(int i=1;i<b*y;i++)
        {
            if(i%b==0&&i%y==0)
            {
                l=i;

                break;

            }
        }
        return l;

    }

    static int hcf(int x,int y)
    { int h=1;
        for(int i=x*y;i>1;i--)
        {
            if(x%i==0&&y%i==0)
            {
               h=i;
               break; 
            }
        }
        return h;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("enter a/b");
        int a=s.nextInt();
        int b=s.nextInt();

        System.out.println("enter x/y");
        int x=s.nextInt();
        int y=s.nextInt();
int l=lcm(b,y);
        int num=a*l/b+x*l/y;
int h=hcf(num,l);

        System.out.printf("sum= %d/%d",num/h,l/h);


        
    }
}
