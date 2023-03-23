import java.util.Scanner;
public class P17AutomorphicNumber {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);

        int a=s.nextInt();

        int n=a*a;
        
        if(a==(n%10))
        {
            System.out.println("number is automorphic");
        }

    }


}
