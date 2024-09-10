import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter character : ");
        // int Number = input.nextInt(); // This is for number.

        // System.out.print("Enter a alphabet : "); 
        // char alphabet = input.next().charAt(50); // This is for character.
        // input.close();
        // Check number is even or odd
        
        // if(Number % 2 == 0){
        //     System.out.println( Number + " is even number.");
        // }
        // else{
        //     System.out.println( Number + " is odd number.");
        // } 

        // Check vowel or consonants
        // if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
        //     System.out.println( alphabet + " is vowel");
        // }
        // else{
        //     System.out.println(alphabet + " is consonants");
        // }

        // Check Leap years or not

        /* int b = 2024-Number;
        if(b%4==0){
            System.out.println(Number + " is leap year");
        }
        else{
            System.out.println(Number + " is not year");
        } */

        Scanner sc = new Scanner(System.in);
        String website =  sc.next();
        sc.close();
        if(website.endsWith(".com")){
            System.out.println("This is commercial websites.");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is organizational websites");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian websites");
        }
        else{
            System.out.println("This is not a websites.");
        }
    }
}
