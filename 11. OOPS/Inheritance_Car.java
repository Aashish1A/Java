class Vehicle{

    int wheelCount;
    String model;

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
        System.out.println("Creating vehicle with wheels.");
    }

    void start(){
        System.out.println("Vehicle is starting");
    }

}

public class Inheritance_Car extends Vehicle {

    // Method overriding
    void start(){
        Scooter obj = new Scooter();
        ScooterObj.breaking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model + " " + "Car is Starting.");
    }

    Inheritance_Car breaking{
        return this;
    }

    Inheritance_Car(){
        super(4);
        System.out.println("Car is being created.");
    }
     
    public static void main(String[] args) {
        Inheritance_Car obj = new Inheritance_Car();
        obj.wheelCount = 4;
        obj.model = "I10";
        obj.start();
        System.out.println(obj.wheelCount);
    }
}

class Scooter{
    void breaking(Inheritance_Car car){
        System.out.println(Inheritance_Car.model + "car is scooter");
    }
}