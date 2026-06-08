class Solution {
    public boolean isValidSudoku(char[][] board) {
          Set<String> box = new HashSet<>();

        for(int i = 0 ; i < 9 ; i++){

            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();

            for (int j = 0 ;  j< 9 ; j++){

                if (board[i][j] != '.'){
                    if(     !rows.add(board[i][j]) ||
                            !box.add(board[i][j] + " in box " + i/3 + "-" + j/3)){

                        return false;
                    }    
                }

                if (board[j][i] != '.'){
                    if(!cols.add(board[j][i])){
                        return false;
                    }
                }

            }
        }

        return true;
    }
}