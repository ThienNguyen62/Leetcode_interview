---
name: leetcode-tutor
description: Soạn tài liệu và lời giải luyện LeetCode trong repo khi người dùng tag hoặc chỉ định thư mục bài. Cập nhật readme.md từ đề tiếng Anh chính thức, viết note.md hướng dẫn tư duy bằng tiếng Việt và lưu chương trình theo từng ngôn ngữ.
---

# Luyện LeetCode theo thư mục bài

Dùng thư mục người dùng tag làm phạm vi chỉnh sửa. Lấy số bài và tên bài từ tên thư mục hoặc README hiện có, đối chiếu với trang chính thức của LeetCode. Khi người dùng chỉ nêu tên, số hoặc tag thuật toán, dùng ngữ cảnh để xác định bài. Nếu chỉ có tag rộng, chọn một bài tiêu biểu và nói rõ lựa chọn. Khi chưa xác định được thư mục đích, có thể hướng dẫn trong chat.

## 1. Cập nhật `readme.md`

- Tra cứu trang bài bằng tiếng Anh trên LeetCode. Dùng trang này để kiểm tra yêu cầu, ví dụ, ràng buộc và phần Custom Judge hoặc Follow-up nếu có. Thêm liên kết trực tiếp đến bài.
- Giữ bản đề tiếng Anh người dùng đã cung cấp trong repo và định dạng lại khi cần. Với nội dung lấy từ web, diễn đạt lại bằng tiếng Anh trong giới hạn trích dẫn, giữ đủ các mục và dữ kiện kiểm chứng được. Nếu không truy cập được nguồn chính thức, báo rõ phần chưa xác minh và tránh đoán.
- Bọc code mẫu trong khối ba dấu backtick có nhãn ngôn ngữ. Bọc các dòng Input và Output của từng ví dụ trong khối ba dấu backtick `text`. Đặt phần giải thích ví dụ bên ngoài khối. Dùng lại file README tương ứng nếu repo đã có cách viết hoa khác.

## 2. Tạo hoặc cập nhật `note.md`

- Viết bằng tiếng Việt. Giải thích chương trình nhận gì, phải trả gì, cấu trúc dữ liệu hoặc tính chất nào của đầu vào ảnh hưởng đến lựa chọn thuật toán.
- Hướng dẫn cách suy nghĩ từ cách trực tiếp đến cách hiệu quả hơn khi có ích. Chỉ ra thao tác lặp thừa hoặc thông tin cần duy trì, giải thích vì sao thuật toán đúng, rồi mô phỏng từng bước trên một ví dụ ngắn trước khi chuyển thành code.
- Với từng cách giải, ghi độ phức tạp thời gian và bộ nhớ phụ, định nghĩa biến Big-O và tính ngăn xếp đệ quy nếu có. Nêu trường hợp biên, lỗi dễ gặp và cách phù hợp với giới hạn của bài. Gắn từng cách được triển khai với file lời giải tương ứng.

## 3. Viết chương trình theo thư mục ngôn ngữ

- Dùng các thư mục ngôn ngữ hiện có của bài. Khi người dùng yêu cầu ngôn ngữ cụ thể, chỉ xử lý các ngôn ngữ đó. Nếu bài chưa có thư mục ngôn ngữ và người dùng chưa chỉ định, ưu tiên ngôn ngữ của file đang làm hoặc Python khi thiếu ngữ cảnh.
- Một cách giải dùng tên `solution.<đuôi>`. Nhiều cách trong cùng một ngôn ngữ dùng `solution1.<đuôi>`, `solution2.<đuôi>` và tiếp tục đánh số. Kiểm tra file hiện có trước khi tạo hoặc đổi tên để tránh bản trùng và giữ các lời giải đang có. Trên hệ thống không phân biệt hoa thường, xử lý `Solution.<đuôi>` như file tương ứng. Với Java, nếu dùng lớp top-level `public`, tên lớp phải khớp tên file.
- Tra cứu mục Solutions của LeetCode, ưu tiên các bài cộng đồng có nhiều lượt bình chọn và đối chiếu hướng giải với ràng buộc của đề. Dùng hướng phổ biến nhất trong các nguồn kiểm chứng được cho lời giải chính của mỗi ngôn ngữ. Nếu có nhiều file, đặt hướng chính trong `solution1.<đuôi>`. Dẫn nguồn trong `note.md`. Khi không xác minh được thứ hạng, nêu căn cứ chọn và mức độ chắc chắn.
- Đặt toàn bộ thuật toán trong hàm hoặc phương thức `solution`. `main` chỉ đọc và chuyển dữ liệu nhập sang kiểu cần thiết, gọi `solution` rồi định dạng và in kết quả. Với Python, gọi `main()` qua khối `if __name__ == "__main__":`. Nếu bài sửa dữ liệu tại chỗ, hiển thị cả giá trị trả về và phần dữ liệu dùng để kiểm tra kết quả.
- Ghi đúng ba cặp Input/Output tự tạo trong comment của mỗi file, khác ví dụ mẫu và đúng định dạng chương trình đọc/in. Chạy ba ca khi có trình biên dịch hoặc thông dịch phù hợp. Báo rõ ngôn ngữ nào chưa chạy được.
