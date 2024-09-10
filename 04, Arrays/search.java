// public class search_array {
//     public static void main(String[] args) {
//         int[] x = {5,6,7,8,21,34};
//         int num = 35;
//         for(int element:x){
//             if(element==num){
//                 System.out.println("Number is present in this array.");
//             }else{
//                 System.out.println("Number is not present in the array.");
//             }
//         }
//     }
// }

/*public class search_array {
    public static void main(String[] args) {
        int[] x = {5,6,7,8,21,34};
        int num = 35;
        boolean isInArray = false;
        for(int element:x){
            if(element==num){
                isInArray = true;
                break;
            }
             if(isInArray) {
                System.out.println("Number is present in this array.");
             } 
                System.out.println("Number is not present in the array.");
            }
        }
    }*/

// Find duplicate elements in an array

public class search{
    public static void main(String[] args) {
        int[] arr = {4,5,3,4,6,3,8};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.err.println("Duplicate element is : " + arr[i]);
                }
            }
        }
    }
}
