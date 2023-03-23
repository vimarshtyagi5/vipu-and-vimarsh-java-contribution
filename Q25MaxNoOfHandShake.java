import java.util.Scanner;

public class Q25MaxNoOfHandShake {
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. opf people");
        int n=s.nextInt();

        System.out.println("Total no. of handshakes in the group are="+n*(n-1)/2);
            
    }
}
