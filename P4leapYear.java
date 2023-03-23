import java.util.Scanner;
public class P4leapYear {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int temp;

        if(a%400==0||(a%4==0&&a%100!=0))
        {
            System.out.println("year is a leap year");
        }
        else 
        {
            System.out.println("year is  not a leap year"); 
        }

}
}
