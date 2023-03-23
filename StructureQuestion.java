import java.util.Scanner;

class student
{
     int id;
     String name;
     int result;

    public student(int id, String name, int result) {
        this.id = id;
        this.name = name;
        this.result = result;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getResult() {
        return result;
    }


}

public class StructureQuestion {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int n = s.nextInt();
        student[] st = new student[n];


        for (int i = 0; i < n; i++) {

         int z=  s.nextInt();
           s.nextLine();
          String x=s.nextLine();

           int c=s.nextInt();
            st[i]= new student(z,x,c);

        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(st[i].getId());
            System.out.println(st[i].getName());
            System.out.println(st[i].getResult());
        }










    }
}
