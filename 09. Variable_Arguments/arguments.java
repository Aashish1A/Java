public class arguments{
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a+b+c+d;
    // }

    static int sum(int ...arr){
        // Available as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }  
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is : " + sum(4,5));
        System.out.println("The sum of 4, 6 and 5 is : " + sum(4,6, 5));
        System.out.println("The sum of 4,5,8 and 9 is : " + sum(4,5,8,9));
    }
}