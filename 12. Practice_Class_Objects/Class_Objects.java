class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Students{
    String name;
    int roll;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.age);
    }

    //Constructor
    Students(){
        System.out.println("Default constructor");
    }

    //copy constructor
    Students(Students s2){
        this.name = s2.name;
        this.roll = s2.roll;
        this.age = s2.age;
    }
}

public class Class_Objects {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "BallPen";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";

        pen1.write();
        pen1.printColor();
        pen2.printColor();

        Students s1 = new Students();
        s1.name = "Aashish";
        s1.roll = 07;
        s1.age = 18;
        
        Students s2 = new Students(s1);
        s2.printInfo();
    }
}
