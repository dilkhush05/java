public class Nqueens {
static int i =0;
    public static void nQueens(char board[][], int row ){
       
        //base case 
        if(row == board.length){
            
            System.out.print(i++);
            BoardPrint(board);
            
            return ;
        }


        for(int j =0;j< board.length;j++){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'x';
        }
    }

    public static void BoardPrint(char board[][]){
        
         System.out.println("-----next-----");
        int n = board.length;
        for(int i =0;i< n;  i++){

            for(int j =0; j<n ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];

        for(int i = 0; i< board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board , 0);
    }

    
}
