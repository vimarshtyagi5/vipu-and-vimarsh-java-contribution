package Array;
//  i/p-> {4,5,0,1,9,0,5,0}    o/p-> {4 5 1 9 5 0 0 0}
public class TCSchocolatefactoryconveyrbelt {

    public static void main(String[] args) {
        int[] a={4,5,0,1,9,0,5,0};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length-1;j++)
            {
                if(a[j]==0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }


        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
