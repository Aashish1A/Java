import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        /* 
        byte m1, m2 , m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics : ");
        m1 = sc.nextByte();
        System.out.println("Enter the marks of Chemistry : ");
        m2 = sc.nextByte();
        System.out.println("Enter the marks of Mathematics : ");
        m3 = sc.nextByte();
        sc.close();
        float avg = (m1+m1+m3)/3.0f;
        System.out.println("Your overall percentage is : " + avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("Congratulation you have been promoted");
        }
        else{
            System.out.println("Sorry, You are not promoted");
        } */
        
        Scanner sc = new Scanner(System.in);
        int day= sc.nextInt();
        sc.close();
        switch (day){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
        }

    }
}
