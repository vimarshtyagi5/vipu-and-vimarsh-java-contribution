import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SlidingWindow2_FindFirst_Negative_no_in_a_SubAaayOf {
    

    public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    Queue<Integer> q=new ArrayDeque<>() {
        
    };

    int [] a={12,-1,-7,8,-15,30,16,28};
    int k=3;
    
// ab karte hai sliding window se 

    int i=0; // start of window 
    int j=0; // end of window
    int sum=0;
    int max=0;
    while(j<7)
    { if(a[j]<0)
        {
            q.add(a[j]);
        }
       
       if(j-i+1<k)
       {
        j++;
       }
       else if(j-i+1==k)
       {
        System.out.println(q.peek());
        
        j++;
        i++;
        
        if(q.peek()==null)
        {
            
        }
        
        else{
         q.remove();}
        
       }
     }

     //System.out.println(max);




}
}
