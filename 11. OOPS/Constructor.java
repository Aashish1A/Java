public class Constructor {
    public static void main(String[] args) {

        // Using default constructor
        Complex num = new Complex();
        num.print();

        // Using parameterized constructor
        Complex num1 = new Complex(2,3);
        num1.print();

         // Using copy constructor
        Complex num2 = new Complex(num1); 
        num2.print();

        // Add 
        System.out.println("Adding two numbers ");
        Complex result = num1.add(num2);
        result.print();


    }
}

class Complex{
    int a,b;

    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }


    // default constructor
    public Complex(){
        a = 0;
        b = 0;
    }

    // parameterized constructor
    // public Complex(int real, int imaginary){
    //     a = real;
    //     b = imaginary;
    // }

    // copy constructor
    public Complex(Complex c){
        a = c.a;
        b = c.b;
    }

    void print(){
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex num2){
        Complex newNum = new Complex(a+num2.a, b+num2.b);
        return newNum;
    }
}
