class Rectangle{
    int length;
    int breadth;

    public int calcArea(){
        return length*breadth;
    }

    public void displayArea(){
        System.out.println("The area of rectangle is : " + calcArea());
    }
}

class Employee{
    String name;
    String position;
    int salary;

    Employee(String n, String p, int s){
        this.name = n;
        this.position = p;
        this.salary = s;
    }

    public void displayInfo(){
        System.out.println("Name of Employee is : " + name);
        System.out.println("Position of Employee is : " + position);
        System.out.println("Salary of Employee is : " + salary);
    }
}

public class Rect{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.breadth = 5;
        rec.displayArea();

        Employee e1 = new Employee("Aashish", "HR", 50000);
        e1.displayInfo();
    }
}