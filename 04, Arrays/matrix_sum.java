public class matrix_sum {
    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3}, {4,5,6}};
        int[][] matrix2 = {{6,2,4}, {3,8,9}};
        int[][] result= {{0,0,0}, {0,0,0}};

        for(int i=0; i<matrix1.length; i++){ //row no of time
            for(int j=0;j<matrix1[i].length; j++){ //column no of time
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0; i<matrix1.length; i++){ //row no of time
                for(int j=0;j<matrix1[i].length; j++){ //column no of time
                    System.out.print(result[i][j] + " ");
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
                System.out.println("");
            }
    }   
}
