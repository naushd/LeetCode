class Solution {
   public void solve(char[][] board) {

        int row = board.length;
        int col = board[0].length;

        for(int r = 0 ; r < row  ; r++){
            dfs(board, r, 0);
            dfs(board, r, col - 1);
        }

        for(int c = 0 ;  c < col ; c++){
            dfs(board, 0, c);
            dfs(board, row - 1, c);
        }

        for(int r = 0 ; r < row  ; r++){

            for(int c = 0 ;  c < col ; c++){

                if(board[r][c] == 'O'){
                    board[r][c] = 'X';
                }
                else if (board[r][c] == 'S') {
                    board[r][c] = 'O';
                }
            }

        }

    }

    private void dfs(char[][] board, int r, int c){

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length){
            return;
        }

        if(board[r][c] != 'O'){
            return;
        }

        board[r][c] = 'S';

        // UP
        dfs(board, r - 1, c);

        //Down
        dfs(board, r + 1, c);

        //Left
        dfs(board, r, c - 1);

        //Right
        dfs(board, r, c + 1);

    }
}