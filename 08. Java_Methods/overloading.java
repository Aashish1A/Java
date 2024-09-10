public class overloading {
    static void foo(){
        System.out.println("Good morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " Bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " Bro!");
        System.out.println("Good morning " + b + " Bro!");
    }


    static void changes(int a){
        a = 98;
    }

    static void changes2(int [] arr){
        arr[0] = 98;
    }

    static void tellJoke(){
        System.out.println("I invented a new word!\n" + 
            "Plagiarisms!");
    }   
    public static void main(String[] args) {
        // tellJoke();

        // case 1: Changing the integer
        // int x =46;
        // changes(x);
        // System.out.println("The value of x after running change is : " + x);

        // case 2: Changing the array
        // int [] marks = {45,67,98,56,89};
        // changes2(marks);
        // System.out.println("The value of x after running change is : " + marks[0]);


        // Methods overloading
        foo();
        foo(300);
        foo(400, 500); // Arguments are actual!
    }
}
