public class Rec1Power_of_a_Number_using_Recursion {
    static int recursionPow(int a, int b)
    {    if (b==0)
    {
        return 1;
    }

        return a*recursionPow(a,b-1);
    }
    public static void main(String[] args) {


        System.out.println(recursionPow(2,3));
    }
}
