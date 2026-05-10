func isValidSudoku(board [][]byte) bool {
    for i := 0; i < 9; i++{
       rowset := make(map[byte]struct{})
       colset := make(map[byte]struct{})
       boxset := make(map[byte]struct{})
       for j:= 0; j < 9;j++{
            char := board[i][j]
            if char != '.'{
                _,c := rowset[char]
                if c {
                    return false
                }
                rowset[char] = struct{}{}
            }

             char = board[j][i]
            if char != '.'{
                _,c := colset[char]
                if c {
                    return false
                }
                colset[char] = struct{}{}
            }
            RI := 3 * (i/3) + j/ 3
            CI := 3 * (i%3) + j%3
            char = board[RI][CI]
            if char != '.'{
                _,c := boxset[char]
                if c {
                    return false
                }
                boxset[char] = struct{}{}
            }
       }
    }
    return true
}
