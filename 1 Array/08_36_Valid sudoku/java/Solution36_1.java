// Dùng hashset
import java.util.*;
class Solution36_1 {
    public boolean isValidSudoku1 ( char [][] board)
    {
        // HashSet để ghi nhớ những gì đã xuất hiện
        HashSet<String> seen = new HashSet<>();
        // duyệt từng ô trong bẩng
        for ( int i =0;i<9;i++)
        {
            for ( int j=0;j<9;j++)
            {
                char current = board[i][j];
                // nếu là ô trống thì ổ qua
                if (current =='.')
                {
                    continue;
                }
                // kiểm tra trùng trong hàng
                String rowKey = current +"in row"+ i;
                if (!seen.add(rowKey))
                {
                    return false;
                }
                // kiểm tra trùng trong cột 
                String colKey = current +"in col" +i;  // in col là string để hashset phân biệt giữa col và row
                if (!seen.add(colKey))
                {
                    return false;
                }
                // kiểm tra trùng trong ô 3x3
                int boxIndex = (i/3) *3 + (j/3);
                // i/3 vì có 3 hàng phòng. j/3 vì có 3 cột phòng
                // muốn nhảy sang hàng tiếp theo phải nhân 3, phải bỏ qua 3 phòng của hàng trên
                String boxKey = current +"in box" + boxIndex;
                if (!seen.add(boxKey))
                {
                    return false;
                }
            }
        }
        // thỏa mãn
        return true;
    }
}
/*
row quyết định nhảy tầng, col chỉ quyết định dịch ngang */

/*
vd
board =
[
  ['1', '2', '.', '.'],
  ['.', '1', '.', '.'],
  ['.', '.', '2', '.'],
  ['.', '.', '.', '.']
]

set ban đầu  {}
i=0;i=0   board[0][0] =1
current = 1 khác '.'

Tạo key:
       rowKey = "1 in row 0"
       colKey = "1 in col 0"
       boxIndex = (0/2)*2 + (0/2) = 0
       boxKey = "1 in box 0"

Thêm vào HashSet:
       add("1 in row 0")  → true
       add("1 in col 0")  → true
       add("1 in box 0")  → true
Hashset lúc này
{
  "1 in row 0",
  "1 in col 0",
  "1 in box 0"
}
  --------------\
🔹 j = 1 → board[0][1] = '2'
current = '2'
Keys:
"2 in row 0"
"2 in col 1"
boxIndex = (0/2)*2 + (1/2) = 0
"2 in box 0"
Thêm thành công hết.


{
  "1 in row 0", "1 in col 0", "1 in box 0",
  "2 in row 0", "2 in col 1", "2 in box 0"
}
  ----------------
🔹 j = 2 → board[0][2] = '.'
👉 Bỏ qua (continue)
🔹 j = 3 → board[0][3] = '.'
👉 Bỏ qua
🔁 i = 1 (hàng 1)
🔹 j = 0 → board[1][0] = '.'
👉 Bỏ qua
--------------------
🔹 j = 1 → board[1][1] = '1'
⚠️ Đây là chỗ quan trọng
Keys tạo ra:
rowKey = "1 in row 1"
colKey = "1 in col 1"
boxIndex = (1/2)*2 + (1/2) = 0
boxKey = "1 in box 0"
🚨 Kiểm tra từng add
add("1 in row 1") → true
✔️ khác "1 in row 0"
add("1 in col 1") → true
✔️ khác "2 in col 1"
add("1 in box 0") → false ❌

🚨 Vì trong set đã có:
1 in box 0"
























*/