package Array;

public class Determine_Array_is_a_subset_of_another_array_or_not {
    public static void main(String[] args) {

        int [] a1={3,4,5,2,4,4,3,4,5,6,7,3,4,5};
        int [] a2={3,4,5};

        int n=a1.length;
        int k=a2.length;
        int i=0,j=0,count=0;
        int sum=0;


        while(j<n)
        {
            if(a1[j]==a2[i])
            {
                count++;
                i++;
                j++;


            }
            else {
                i=0;
                j++;
                count=0;

            }

            if(i==k)
            {
                i=0;
            }

//            if(count==k)
//            {
//                System.out.println("present");
//                break;
//            }
//
//            else
//                System.out.println("not present");

            //System.out.println(i+" "+j+" "+count);

            if(count==k)
            {
                sum++;
            }
        }
        System.out.println("there are "+sum+" subset persent in the array");


    }
}
