public class Array_Operation {
    public static void main(String[] args) {
        // String[] students = {"maria","sanju","jeeva","aashish"};
        // System.out.println(students.length);
        // System.out.println(students[3]);
        // float[] marks = {34.5f,54.23f,65.3f,76.9f};

        int[] marks = {100,500,23,534,24};
        System.out.println("The length of array : " + marks.length);
        
        // Diplaying the Array elements using loop
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);

        // Displaying the array elements in reverse order.
        // for(int i=marks.length -1;i>=0; i--){
        //     System.out.println(marks[i]);
        // }

        // Display the array elements using for-each loop
        for(int element: marks){
            System.out.println(element);
        }
    }
}
