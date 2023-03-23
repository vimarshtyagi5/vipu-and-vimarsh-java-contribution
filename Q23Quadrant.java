import java.util.Scanner;
public class Q23Quadrant {

    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the value of x  and y");
        int x=s.nextInt();
        int y=s.nextInt();

        if(x>0&&y>0)
        {
            System.out.println("First Quadrant");
        }
        else if(x<0&&y>0)
        {
            System.out.println("second Quadrant");
        }
        else if(x<0&&y<0)
        {
            System.out.println("third Quadrant");
        }
        else 
        {
            System.out.println("fourth Quadrant");
        }

    }
}

