public class Rec2Prime_Number_using_Recursion {
       static int i=2;
     static boolean checkprime(int n) {

         if(n<=2)
         {
             return true;
         }
         if(n%i==0)
         {
             return false;
         }

         if(i==n/2+1)
             return true;
         i++;

         return checkprime(n);


    }
    public static void main(String[] args) {
        System.out.println(checkprime(17));
    }


}
