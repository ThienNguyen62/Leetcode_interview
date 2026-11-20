// dùng 3 boolen
class Solution36_2 {
    public boolean isValidSudoku2( char [][] board)
    {
        boolean [][] row = new boolean [9][9]; // kiểm tra num đã suất hiện trong hàng row chưa, nêu row[i][k] == true thì số k+1 suất hiện ở hàng i
        boolean [][] col = new boolean [9][9];
        boolean [][] box = new boolean [9][9];
        for ( int i =0; i<9;i++)
        {
            for ( int j=0; j<9;j++)
            {
                char c = board [i][j];
                if ( c=='.')
                {
                    continue; // bỏ qua ô trống
                }
                int num = c -'1'; // '1' ->0, '9'->8
                int boxIndex = (i/3) *3 +(j/3);
                if (row[i][num]|| col[j][num] || box[boxIndex][num]) // kiểm tra trùng
                {
                    return false;
                }
                // không trùng thì thêm vào
                row[i][num] = true;
                col[j][num] = true;
                box[boxIndex][num] = true;
            }
        }
        return true;
    }
}


