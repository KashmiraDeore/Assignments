import java.util.Scanner;
public class Employee 
{
        int id;
        double salary;
        String name;

        public Employee(int id, double salary, String name)
        {
            this.id=id;
            this.salary=salary;
            this.name=name;
        }
        public  int getid()
        {
            return id;
        }
        public double getsalary()
        {
            return salary;
        }
        public String getname()
        {
            return name;
        }
        public void Display()
        {
            System.out.println("id: "+id);
            System.out.println("Salary : "+salary);
            System.out.println("Name: "+name);
        }  
    public static void main(String args[])
    {
        Employee e= new Employee(423301,23.06,"Ram");
        e.Display();
    }
}