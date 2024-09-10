public class Arguments{

         //print table
        static void table(int n){
            for(int i=0; i<=10; i++){
                System.out.format("%d X %d = %d\n", n, i, n*i);
            }
        }

        // pattern-1
        static void pattern1(int n){
            for(int i=0; i<n; i++){
                for(int j=0; j<i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Recursive fn to find sum of first n natural no.
        static int sumRec(int n){
            if(n==1){
                return 1;
            }
           return n + sumRec(n-1);
        }

        // Print pattern
        static void pattern2(int n){
            for(int i=n; i>0; i--){
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // print nth term of fibonacci series using recursion.
        static int fib(int n){
            if(n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            }
            else{
                return fib(n-1) + fib(n-2);
            }
        }
        
        

    
    public static void main(String[] args) {
        // table(7);

        // pattern1(4);

        // int c = sumRec(6);
        // System.out.println(c);

        // pattern2(4);

        int result = fib(7);
        System.out.println(result);
    }
}