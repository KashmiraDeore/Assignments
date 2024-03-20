import java.util.Scanner;
    public class Student 
    {
         String Name;
         int rollNo;
         int std;

         public Student(String name, int rollNo, int std)
         {
            this.Name=name;
            System.out.println("Name: "+name);
            this.rollNo=rollNo;
            System.out.println("rollNo: "+rollNo);
            this.std=std;
            System.out.println("Standard: "+std);
         }
    

    public static void main(String args[])
    {
        Student s1=new Student("Kash",24,9);
    }
}
