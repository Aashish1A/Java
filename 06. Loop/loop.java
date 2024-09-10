// while loop in Java
class loop{
    public static void main(String[] args) {
//        int i=1;
//         while(i<=10){
//             System.out.println(i);
//             i++; 
//         }

// do-while loop in Java
        // int i=0;
        // do{
        //     System.out.println(i); 
        //     i++;
        // }while(i<=5);

// for loop in Java
        // for(int i=0; i<=5; i++){
        //     System.out.println(i);
        // } 
        
        // print first five odd no  
        // int n=5;
        // for(int i=0; i<n; i++){
        //         System.out.println("Odd no is : " +(2*i+1));
        // }

        // decrementing for loop which print no from 5 to 1
        // for(int i=5; i>0; i--){
        //     System.out.println(i);
        // }

// break and continue in Java
    //  for(int i=0; i<=5; i++){
    //     System.out.println(i);
    //     System.out.println("Java is great.");
    //     if(i==2){
    //         System.out.println("ending loop");
    //        break;
    //     }
    //  }   

    for(int i=0; i<=5; i++){
        if(i==2){
            System.out.println("ending loop");
           continue;
        }
        System.out.println(i);
        System.out.println("Java is great.");
     }

    }
}
