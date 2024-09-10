/* public class sum {
    public static void main(String[] args) {
        float[] marks= {12.3f,56.6f,76.6f,98.6f,56.3f};
        float sum = 0;
        for(float element:marks){
            // System.out.println(element);
            sum = sum + element;
        }
        System.out.println("The sum of 5 float no is : " + sum);
    }
}*/

public class avg{
    public static void main(String[] args) {
        int[] marks={76,89,76,98,65};
        int sum = 0;
        for(int element:marks){
            sum = element+sum;
        }
        System.out.println("The average marks of students is : " + sum/marks.length);
    }
}
