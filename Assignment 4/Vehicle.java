import java.util.Scanner;
public class Vehicle 
{
        String name;
        int year;
        String model;

        public Vehicle(String name, int year, String model)
        {
            this.name=name;
            this.year=year;
            this.model=model;
        }
        public String getname()
        {
            return name;
        }
        public int getyear()
        {
            return year;
        }
        public String model()
        {
            return model;
        }
        public void Display()
        {
            System.out.println("Name: "+name);
            System.out.println("Year : "+year);
            System.out.println("Model: "+model);
        }
    
    public static void main(String args[])
    {
        Vehicle v=new Vehicle("Scorpio",2023,"MHJ");
        v.Display();
    }
}