public class MainClass {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "leo";
        d2.walk();

        Complex num1 = new Complex();
        num1.a = 5;
        num1.b = 3;
        num1.print();

        Student s1 = new Student();
        s1.name = "Aashish";
        s1.age = 18;
        s1.roll = 07;
        s1.studentData();
    }
}

class Complex{
    int a,b;
    void print(){
        System.out.println(a + " + " + b + "i");
    }
}

class Dog{ 
    String name;
    int age;
    String colors;

    void bark(){
        System.out.println(name + " is barking");
    }
    void walk(){
        System.out.println(name + " is walking");
    }
}

class Student{
    String name;
    int age;
    int roll;

    void studentData(){
        System.out.println("Name : " + name + "Age : " + age + "Roll no : " + roll);
    }
}