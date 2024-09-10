public class reverse_array {
    public static void main(String[] args) {
        // int[] arr = {3,4,5,6,7,9,8};
        // int l=arr.length;
        // int n = l/2;
        // int temp;

        // for(int i=0;i<n; i++){
        //     temp = arr[i];
        //     arr[i] = arr[l-1-i];
        //     arr[l-1-i] = temp;
        // }
        // for(int element: arr){
        //     System.out.print(element + " ");
        // }

        // Maximum element in Array

        /*int[] arr={5,6,7,8,34,56,9};
        int max=0;
        for(int element: arr){
            if(element > max){
                max = element;
            }
        }
        System.out.println("The value of max element in arr is : " + max); */

        // Minimum element in Array

        int[] arr={5,6,7,8,34,56,9};
        int min=1;
        for(int element: arr){
            if(element < min){
                min = element;
            }
        }
        System.out.println("The value of min element in arr is : " + min); 
    }
}
