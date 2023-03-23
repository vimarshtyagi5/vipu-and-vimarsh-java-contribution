public class R10SumOfNumbersIn_a_String {
    

    public static void main(String[] args) {
     
        String s = "1234";
        int a= Integer.valueOf(s);
        int sum=0;
        while(a!=0)
        {
            int rem=a%10;
            a=a/10;
            sum=sum+rem;
        }

        System.out.println(sum);
     }
}
