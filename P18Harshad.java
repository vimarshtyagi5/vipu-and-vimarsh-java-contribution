import java.util.Scanner;
public class P18Harshad {
  

  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int n=a;
    int sum=0;
    while(a!=0)
    { int r=a%10;
      sum=sum+r;
      a=a/10;
      
    }
    if(n%sum==0)
    {
        System.out.println("Number is Harshad");
    }
    else
    System.out.println("Number is not Harshad");

    
  }  
   

}



