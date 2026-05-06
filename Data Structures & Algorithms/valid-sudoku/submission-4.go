func isValidSudoku(board [][]byte) bool {
    for i := 0; i < 9; i++{
        row := make(map[byte]struct{})
        col := make(map[byte]struct{})
        box := make(map[byte]struct{})
        for j := 0; j < 9; j++{
            val := board[i][j]
            if val != '.'{
                _,b := row[val]
                if b{
                    return false
                }
                row[val] = struct{}{}
            }
            val = board[j][i]
            if val != '.'{
                _,b := col[val]
                if b{
                    return false
                }
                col[val] = struct{}{}
            }
            r := 3 * (i/3) + j / 3
            c := 3 * (i%3) + j % 3
            val = board[r][c]
            if val != '.'{
                _,b := box[val]
                if b{
                    return false
                }
                box[val] = struct{}{}
            }
        }
    }
    return true
}
