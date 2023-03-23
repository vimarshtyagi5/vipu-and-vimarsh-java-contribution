package CompanyCodesTCS;

import java.util.Scanner;

// https://www.youtube.com/watch?v=Zm_99La_Mro
//  23:29 sec
public class ParkingSpaceProblem {

    public static void main(String[] args) {;
        int r=4;
        int c=3;
        int sum=0;
        int m=0;
        int x=0;
        Scanner s=new Scanner(System.in);
        int[][]a=new int[r][c];

        System.out.println("enter 12 elements as 0 or 1 only");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();

            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              sum+=a[i][j];

            }
            if(m<sum)
            {
                m=sum;
                x=i;
            }

        }

        System.out.println((x+1)+"th row");
    }
}
