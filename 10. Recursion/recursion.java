public class recursion{
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial x is : " + factorial(x));
    }
}