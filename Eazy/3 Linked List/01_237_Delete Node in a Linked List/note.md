# Bài 237 · Delete Node in a Linked List

## Tư duy giải bài

Muốn xóa theo cách thông thường cần con trỏ tới node trước để nối qua node cần xóa. Đề chỉ đưa node đích, nên hãy nhìn sang node kế tiếp. Chép giá trị từ node kế tiếp vào node đích rồi nối qua node kế tiếp. Kết quả mất đúng giá trị cũ và thứ tự các giá trị còn lại được giữ. Cách này cần node đích có node kế tiếp, đúng với ràng buộc.

Ví dụ `8 → 3 → 6 → 2`, cần xóa 3. Ghi 6 vào ô đang chứa 3, rồi cho ô đó trỏ thẳng đến 2, được `8 → 6 → 2`. Hàm nhận đúng một node và dùng O(1) thời gian, O(1) bộ nhớ phụ. Nếu có head, có thể dò node trước trong O(n) thời gian, với n là số node; thao tác đó chỉ dùng trong chương trình chạy thử để tìm node được giao.

Nhập `n target`, sau đó nhập n giá trị. Chương trình tìm node có giá trị target, gọi hàm và in danh sách còn lại.

Lời giải chính có trong [C++](C++/Solution.cpp), [Java](java/Solution.java) và [Python](python/Solution.py). Chưa xác minh được thứ hạng bình chọn trên LeetCode. [Doocs](https://leetcode.doocs.org/en/lc/237/)
