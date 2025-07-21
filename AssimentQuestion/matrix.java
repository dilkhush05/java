
// Question 1 : Print the number of 7’s that are in the 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2


public class matrix {

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void SumOfKeyElementin2Dmatrix(int matrix[][] , int key){
        int count =0;
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                    continue;
                }
            }
        }
        if(count == 0){
            System.out.print("Ket is not in This array");
        }else{
        System.out.print("The Count of " + key + " is :" + count);
        }
    }

//     Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

    public static void SumofThematrix(int mat[][]){
        int Sum =0;
        
        for(int j = 0; j< mat[0].length ; j++){
             Sum+= mat[1][j];   
            
        }
        System.out.print("The sum of arr is:" + Sum);
    }

// Question 3 : Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23


    public static void transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];  

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j]; 
            }
        }

        printMatrix(transposed);
    }
    public static void main(StringClass[] args) {
        int arr[][] = { {4,7,8},{8,8,7} };

        // SumOfKeyElementin2Dmatrix(arr, 7);
        // SumofThematrix(arr);
         transpose(arr);
         
    }
}
