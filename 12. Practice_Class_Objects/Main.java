class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String n, int r, int m){
        name = n;
        rollNumber = r;
        marks = m;
    }

    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Roll Numbers : " + rollNumber);
        System.out.println("Marks : " + marks);
    }
}

class Circle{
    float radius;

    public void area(){
        float area = 22/7 * 4 * 4;
        System.out.println("The area of circle is : " + area);
    }
}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student("Aashish", 18, 89);
        s1.displayInfo();

        Circle c = new Circle();
        c.area();
    }
}