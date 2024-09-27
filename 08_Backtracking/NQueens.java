public class NQueens{
    public static boolean isSafe(char board[][], int row, int col){
        // Vertical Up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // LEFT UP DIAGNOL
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Right up diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    

    //if we have to print or count our solution.
    // public static void nQueens(char board[][], int row){
    //     if(row==board.length){
    //         //printBoard(board);
    //         count++;
    //         return;
    //     }
    //     for(int j=0; j<board.length; j++){
    //         if(isSafe(board, row, j) == true){
    //             board[row][j] = 'Q';
    //             nQueens(board, row+1);
    //             board[row][j] = 'x';// backtracking step to backtrack and remove the Q and place x 
    //         }
    //     }
    // }

   //this code gives only one solution for n
    public static boolean nQueens(char board[][], int row){
        if(row==board.length){
            return true;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j) == true){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'x';// backtracking step to backtrack and remove the Q and place x 
            }
        }
        return false;
    }



    public static void printBoard(char board[][]){
        System.out.println("-----CHESS BOARD-----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static int count = 0;
    public static void main(String[] args) {
        int n = 4;//Solution is possiblr ie; 2
        char board[][] = new char[n][n];
        // Initialize row and col with empty space
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }

        //if we have to print or count our solution.
        // nQueens(board, 0);
        // System.out.println("Total no. of ways to slove N Queens = " + count);


        //this code gives only one solution for n
        if(nQueens(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        }else{
            System.out.println("solution is not possible");
        }

    }
    
}
