public class ValidSuduko {
    public static Boolean isSafe(int sudoko[][], int row ,int col , int digit){
        // for row check 
        for(int i =0 ; i< 9; i++){
            if(sudoko[row][i] == digit){
                return false;
            }
        }
         // for col check 
        for(int i =0 ; i< 9; i++){
            if(sudoko[i][col] == digit){
                return false;
            }
        }

        // for cgead check

        int stRow = (row / 3) *3;
        int stCol = (col /3) *3;

        for(int i = stRow; i<stRow + 3; i++) {
            for(int j = stCol; j< stCol + 3; j++){
                if(sudoko[i][j] == digit){
                    return false ;
                }
            }
        }
        return true ;
    }

    public static Boolean SudukoCheker(int Suduko[][], int row , int col){
        if(row == 9){
            return true;
        }


        int currrow = row , currcol = col + 1;
        if(currcol == 9){
            currrow = row +1;
            currcol = 0;
        }

        if(Suduko[row][col] != 0){
           return SudukoCheker(Suduko, currrow, currcol);
        }
        // recursion
        for(int  i =1; i<= 9; i++){
            if(isSafe(Suduko , row , col , i )){
                Suduko[row][col] = i;
                if(SudukoCheker(Suduko, currrow, currcol)){
                    return true;
                }
                Suduko[row][col] = 0;
            }
        }
        return false;
    }

    public static void printS(int sudoko[][]){
        for(int  i=0; i< 9; i++){
            for(int j =0; j< 9 ;j++){
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
          int[][] Suduko = {
            {3, 0, 6, 5, 7, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 8, 6, 3, 0, 0}
        };

        if(SudukoCheker(Suduko, 0, 0)){
            System.out.println("This is Valid Suduko");
            printS(Suduko);
        }else {
            System.out.println("This is not Valid Suduko");
        }
        
    }
}
