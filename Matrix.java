import java.util.*;

public class Matrix {
   
    public static void LargestElement(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int row = -1 ,col= -1;
        for(int i= 0;i < matrix.length;i++){
             for(int j =0;j< matrix[0].length; j++){
                if( matrix[i][j] > max ){
                     max = matrix[i][j];
                    row++;
                    col++;
                    
                }
        }
    }
        System.out.println("Largest element is: " + max + " found at (" + row + ", " + col + ")");
}

     public static void SmallestElement(int matrix[][]){
        int max = Integer.MAX_VALUE;
        int row = -1 ,col= -1;
        for(int i= 0;i < matrix.length;i++){
             for(int j =0;j< matrix[0].length; j++){
                if( matrix[i][j] < max ){
                     max = matrix[i][j];
                    row++;
                    col++;
                    
                }
        }
    }
        System.out.println("Smallest element is: " + max + " found at (" + row + ", " + col + ")");
}
    public static Boolean findkey(int matrix[][] , int key){
        for(int i =0; i< matrix.length; i++){
            for(int j =0;j< matrix[0].length; j++){
                if( matrix[i][j] == key){
                    System.out.print("Element found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element Not found in Given Matrix");
        return false;
    }

     public static void SpiralMatrix(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length -1;
        int endcol = matrix[0].length -1;

       
        while( startcol <= endcol && startrow <= endrow){

             // leftside
             for(int j =startcol; j <= endcol ; j++){
                System.out.print(matrix[startrow] [j] + " ");
             }

             //RightSide
             for(int i = startrow+1; i <=endrow; i++){
                if(startrow == endrow) return;
                System.out.print(matrix[i] [endcol] + " ");

             }

             for(int j = endcol -1; j >= startcol ; j--){
                if(startcol == endcol) return;
                System.out.print(matrix[endrow] [j] + " ");
             }

             for(int i = endrow - 1; i >= startrow + 1; i--){
                System.out.print(matrix[i][startcol] + " ");
             }
            
             
            
             
             startrow++;
             startcol++;
             endcol--;
             endrow--;
        }
    }

    public static int DioganalSum(int matrix[][]){
        int sum = 0;
        // //Brut Force
        // for(int i= 0 ; i< matrix.length; i++){
        //     for(int j = 0; j< matrix[0].length; j++){
        //         if(i == j){
        //             sum+= matrix[i][j]; 
        //         }
        //         else if(i+j == matrix.length - 1){
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        // Optimise code

        for(int i = 0; i< matrix.length; i++){
            sum+= matrix[i][i];


            if(i != matrix.length-1-i)
                sum+= matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    public static Boolean Staircasematrix(int matrix[][] ,int Key){
        int row = 0 , col = matrix[0].length -1;
        while(row < matrix.length && col >= 0  ){
            if(matrix[row][col] == Key){
                System.out.print("The key is found (" + row + "," + col +")" );
                return true;
            }
            else if(Key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("Key is not found ");
        return false;
    }
    public static void main(StringClass[] args) {
        int matrix[] [] = {{1 ,2 ,3 },
                            {5 ,6 ,7 },
                            {9 ,10 , 11 },
                            // {12 ,13 , 14},
                            };
        // Scanner Sc = new Scanner(System.in);

        // for(int i =0; i< matrix.length; i++){
        //     for(int j =0;j< matrix[0].length; j++){
        //         matrix[i][j] = Sc.nextInt();
        //     }
        // }

        // // output of the matrix

        // for(int i =0;i < matrix.length;i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // findkey(matrix, 5);
        // LargestElement(matrix);
        // SmallestElement(matrix);
        // SpiralMatrix(matrix);

    //    System.out.print( DioganalSum(matrix));

         Staircasematrix(matrix , 89);
        
        // Sc.close();
    }
}
