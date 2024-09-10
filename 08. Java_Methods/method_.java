public class method_{
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c;
        c = method_.logic(a,b);
        System.out.print("The output is : ");
        System.out.println(c);

        int a1 = 10;
        int b1 = 9;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c1);

    }
}