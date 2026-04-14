class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9;i++)
        {
            HashSet<Character> rowset = new HashSet<>();
            HashSet<Character> colset = new HashSet<>();
            HashSet<Character> boxset = new HashSet<>();
            for(int j = 0; j < 9; j++ )
            {
                char at = board[i][j];
                if(at != '.')
                {
                    if(rowset.contains(at)) return false;
                    rowset.add(at);
                }

                at = board[j][i];
                if(at != '.')
                {
                    if(colset.contains(at)) return false;
                    colset.add(at);
                }
               
                int r = 3 * (i / 3) + j / 3;
                int c = 3 * (i % 3) + j % 3;

                at = board[r][c];
                if(at != '.')
                {
                    if(boxset.contains(at)) return false;
                    boxset.add(at);
                }
            }
        }
        return true;   
    }
}
