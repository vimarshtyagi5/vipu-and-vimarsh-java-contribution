import java.util.Scanner;
public class P16PerfectSquare {

    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int x=(int) Math.sqrt(a);
      // System.out.println(x);
       
       if(a==x*x)
       System.out.println("Number is perfect square");
       else
       System.out.println("Number is not a perfect square");
       
    }
    
}
